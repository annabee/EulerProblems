import org.scalatest.{FlatSpec, Matchers}

class Problem4Spec extends FlatSpec with Matchers {

  "Problem4" should "calculate solution in the given example" in {
    Problem4.solve(2) shouldBe 9009
  }

  "Problem4" should "calculate solution" in {
    Problem4.solve(3) shouldBe 906609
  }
}
