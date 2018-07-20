/*
A palindromic number reads the same both ways.
The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers.
 */

object Problem4 extends App {

  def solve(numDigits: Int): Int = {
    val largest = (1 to numDigits).toList.map(_ => 9).mkString.toInt
    val values = createPairs(1 to largest).map(elem => elem._1 * elem._2).reverse
    values.filter(a => isPalindrome(a)).max
  }

  def createPairs(range: Range): Stream[(Int, Int)] = {
    val a = range.map(a => Seq(a, a))
    val b = range.combinations(2)
    (a ++ b).toStream.map(elems => (elems.head, elems.tail.head))
  }

  def isPalindrome(a: Int): Boolean = {
    a.toString == a.toString.reverse
  }
}
