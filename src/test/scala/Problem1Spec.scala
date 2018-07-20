import org.scalatest.{FlatSpec, Matchers}

class Problem1Spec extends FlatSpec with Matchers {

  "Problem1" should "calculate solution" in {
    Problem1.solve(999, 3, 5) shouldBe 233168
  }
}
