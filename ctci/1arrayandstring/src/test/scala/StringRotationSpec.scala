import StringRotation.isSubstring
import org.scalatest.freespec.AnyFreeSpec
import org.scalatest.matchers.should.Matchers

class StringRotationSpec extends AnyFreeSpec with Matchers {
  "when strings are empty then not a rotation" in {
    isSubstring("", "") shouldBe false
  }

  "when strings have different lengths then not a rotation" in {
    isSubstring("123", "1") shouldBe false
  }

  "when strings have equal length but not the same by any rotation" in {
    isSubstring("water", "wetar") shouldBe false
  }

  "when strings are few rotations from each other then return true" in {
    isSubstring("waterbottle", "erbottlewat") shouldBe true
  }
}
