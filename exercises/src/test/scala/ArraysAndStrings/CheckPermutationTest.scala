package ArraysAndStrings

import org.scalatest.{FlatSpec, Matchers}

class CheckPermutationTest extends FlatSpec with Matchers {
  "isPermutation" should "check if a string is a permutation of another" in {
    CheckPermutationSolution.isPermutation(null, null) shouldBe true
    CheckPermutationSolution.isPermutation("", "") shouldBe true
    CheckPermutationSolution.isPermutation("abc", "abc") shouldBe true
    CheckPermutationSolution.isPermutation("abc", "bac") shouldBe true

    CheckPermutationSolution.isPermutation(null, "") shouldBe false
    CheckPermutationSolution.isPermutation(null, "nslk") shouldBe false
    CheckPermutationSolution.isPermutation("", null) shouldBe false
    CheckPermutationSolution.isPermutation("wndow", null) shouldBe false
    CheckPermutationSolution.isPermutation("abc", "aabbcc") shouldBe false
    CheckPermutationSolution.isPermutation("abc", "abc ") shouldBe false
  }
}

object CheckPermutationTest {
  def main(args: Array[String]): Unit = {}
}
