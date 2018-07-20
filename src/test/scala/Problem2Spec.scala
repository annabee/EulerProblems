import org.scalatest.{FlatSpec, Matchers}

class Problem2Spec extends FlatSpec with Matchers {

  "Problem2" should "calculate solution" in {
    Problem2.solve(4000000) shouldBe 4613732
  }
}
