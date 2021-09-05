import IsUniqueString.isUnique
import org.scalatest.freespec.AnyFreeSpec
import org.scalatest.matchers.should.Matchers

class IsUniqueStringSpec extends AnyFreeSpec with Matchers {

  "when string is empty then is not unique" in {
    isUnique("") shouldBe false
  }

  "when chars are unique then return true" in {
    isUnique("abcde") shouldBe true
  }

  "when chars are not unique then return false" in {
    isUnique("abcda") shouldBe false
  }
}
