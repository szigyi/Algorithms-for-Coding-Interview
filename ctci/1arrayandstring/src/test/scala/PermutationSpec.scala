import Permutation.isPermutation
import org.scalatest.freespec.AnyFreeSpec
import org.scalatest.matchers.should.Matchers

class PermutationSpec extends AnyFreeSpec with Matchers {
  "when strings are empty then return false" in {
    isPermutation("", "") shouldBe false
  }

  "when strings are the same then return true" in {
    isPermutation("abc", "abc") shouldBe true
  }

  "when strings are permutations of each other then returns true" in {
    isPermutation("abcde", "aebdc") shouldBe true
  }

  "when strings are not equal length then return false" in {
    isPermutation("abcde", "cbed") shouldBe false
  }

  "when strings are equal length but not permutations then returns false" in {
    isPermutation("12345", "abcde") shouldBe false
  }
}