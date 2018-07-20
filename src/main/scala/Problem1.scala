/*
If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

Find the sum of all the multiples of 3 or 5 below 1000.
 */

object Problem1 {

  def solve(maxNumber: Int, firstMultiple: Int, secondMultiple: Int): BigInt = {
    (1 to maxNumber).filter(elem => isMultiple(firstMultiple, elem) || isMultiple(secondMultiple, elem)).sum
  }

  def isMultiple(multipleToCheck: Int, number: Int): Boolean = {
    number % multipleToCheck == 0
  }
}
