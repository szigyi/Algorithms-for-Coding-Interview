import PalindromePermutation.isPalindromeViaPermutation
import org.scalatest.freespec.AnyFreeSpec
import org.scalatest.matchers.should.Matchers

class PalindromePermutationSpec extends AnyFreeSpec with Matchers {
  "when string is empty then return false" in {
    isPalindromeViaPermutation("") shouldBe false
  }

  "when string contains two spaces then it is a palindrome" in {
    isPalindromeViaPermutation("  ") shouldBe true
  }

  "when the palindrome string's length is odd then return true" in {
    isPalindromeViaPermutation("Tactcoa") shouldBe true
  }

  "when the palindrome string's length is even then return true" in {
    isPalindromeViaPermutation("Hannah") shouldBe true
  }

  "when string is one char less to be palindrome then return false" in {
    isPalindromeViaPermutation("Nen ne") shouldBe false
  }
}
