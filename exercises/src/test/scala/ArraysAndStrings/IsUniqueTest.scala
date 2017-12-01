package ArraysAndStrings

import org.scalatest.{FlatSpec, Matchers}

class IsUniqueTest extends FlatSpec with Matchers {
  "isUnique" should "check if every character in a string is unique" in {
    IsUnique.isUnique(null) shouldBe true
    IsUnique.isUnique("") shouldBe true
    IsUnique.isUnique("abc123@$ ") shouldBe true
    IsUnique.isUnique("abc") shouldBe true

    IsUnique.isUnique("abcabc") shouldBe false
    IsUnique.isUnique("  ") shouldBe false
    IsUnique.isUnique("1hc3uef9@@") shouldBe false
  }
}
