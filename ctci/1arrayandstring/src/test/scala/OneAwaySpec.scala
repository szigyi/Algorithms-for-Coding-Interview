import OneAway.oneAway
import org.scalatest.freespec.AnyFreeSpec
import org.scalatest.matchers.should.Matchers

class OneAwaySpec extends AnyFreeSpec with Matchers {

  "when one insert away in the second string then return true" in {
    oneAway("pale", "ple") shouldBe true
  }

  "when one insert away in the first string then return true" in {
    oneAway("pae", "pale") shouldBe true
  }

  "when one replace away then return true" in {
    oneAway("pale", "bale") shouldBe true
  }

  "when strings are empty then return false" in {
    oneAway("", "") shouldBe false
  }

  "when both strings are the same then return false" in {
    oneAway("pale", "pale") shouldBe false
  }

  "when 2 edit away then return false" in {
    oneAway("pale", "peke") shouldBe false
  }

  "when one string is too short for 1 edit away then return false" in {
    oneAway("pale", "pe") shouldBe false
  }
}
