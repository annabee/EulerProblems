/*
Each new term in the Fibonacci sequence is generated by adding the previous two terms.
By starting with 1 and 2, the first 10 terms will be:

1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...

By considering the terms in the Fibonacci sequence whose values do not exceed four million,
find the sum of the even-valued terms.

 */

object Problem2 {

  def solve(max: BigInt): BigInt = {

    lazy val fibs: Stream[BigInt] = BigInt(0)#:: BigInt(1) #:: fibs.zip(fibs.tail).map { n => n._1 + n._2 }

    fibs.takeWhile(_ < max).filter(_ % 2 == 0).sum
  }
}
