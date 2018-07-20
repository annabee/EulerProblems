import org.scalatest.{FlatSpec, Matchers}

class Problem3Spec extends FlatSpec with Matchers {

  "Problem3" should "calculate given answer" in {
    Problem3.solve(13195) shouldBe 29
  }

  "Problem3" should "calculate solution" in {
    Problem3.solve(600851475143L) shouldBe 6857
  }
}
