import StringCompression.compress
import org.scalatest.freespec.AnyFreeSpec
import org.scalatest.matchers.should.Matchers

class StringCompressionSpec extends AnyFreeSpec with Matchers {
  "when string is empty then it returns it" in {
    compress("") shouldBe ""
  }

  "when compressed string is longer then returns original" in {
    compress("abcd") shouldBe "abcd"
  }

  "when there are repeating chars then returns the compressed version" in {
    compress("aabcccccaaa") shouldBe "a2b1c5a3"
  }
}
