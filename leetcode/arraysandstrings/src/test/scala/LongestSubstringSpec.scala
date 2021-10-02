import LongestSubstring.longestSubstring
import org.scalatest.freespec.AnyFreeSpec
import org.scalatest.matchers.should.Matchers

class LongestSubstringSpec extends AnyFreeSpec with Matchers {

  "when there is a 4 long unique substring" in {
    longestSubstring("abcdabcbb") shouldBe 4
  }

  "when there is a 1 long unique substring" in {
    longestSubstring("bbbbb") shouldBe 1
  }

  "when there is a 3 long unique substring" in {
    longestSubstring("pwwkew") shouldBe 3
  }

  "when there is a 0 long unique substring" in {
    longestSubstring("") shouldBe 0
  }

  "when there is a 4 long unique substring at the end" in {
    longestSubstring("pwwker") shouldBe 4
  }
}
