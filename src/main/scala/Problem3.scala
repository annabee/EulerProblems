import scala.collection.mutable

/*
The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?
 */

object Problem3 extends App {

  def solve(max: Long): Int = {
    val primesInGiven = calculatePrimesStream(Math.sqrt(max).toInt)
    primesInGiven
      .sorted
      .reverse
      .filter(prime => max % prime == 0)
      .head
  }

  def calculatePrimesStream(end: BigInt): List[Int] = {
    val odds = Stream.from(3, 2).takeWhile(_ <= Math.sqrt(end.doubleValue()).toInt)
    val composites = odds.flatMap(i => Stream.from(i * i, 2 * i).takeWhile(_ <= end))
    Stream.from(3, 2).takeWhile(_ <= end).diff(composites).toList
  }

  def primesUntil(end: Int): List[Int] = {

    val last = end + 1
    val primeIndices = mutable.ArrayBuffer.fill(last.toInt / 2)(1)

    val intSqrt = Math.sqrt(end).toInt
    for (i <- 3 to end by 2 if i <= intSqrt) {
      for (nonPrime <- i * i to end by 2 * i) {
        primeIndices.update(nonPrime / 2, 0)
      }
    }

    (for (i <- primeIndices.indices if primeIndices(i) == 1) yield 2 * i + 1).tail.toList
  }

}
