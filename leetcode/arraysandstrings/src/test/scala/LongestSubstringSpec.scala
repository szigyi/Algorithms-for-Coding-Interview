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

  "when the whole string is unique" in {
    longestSubstring("abcde") shouldBe 5
  }

  "when there is a 0 long unique substring" in {
    longestSubstring("") shouldBe 0
  }

  "when there is a 4 long unique substring at the end" in {
    longestSubstring("pwwker") shouldBe 4
  }

  "leetcode" - {
    "when repeating char is not at the beginning of the new substring" in {
      longestSubstring("dvdf") shouldBe 3
    }
    "when some special scenario in my code" in {
      longestSubstring("ckilbkd") shouldBe 5
    }
    "when repeating at both ends" in {
      longestSubstring("asjrgapa") shouldBe 6
    }
    "when only one white space" in {
      longestSubstring(" ") shouldBe 1
    }
  }
}
