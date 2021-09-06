import Urlify.urlify
import org.scalatest.freespec.AnyFreeSpec
import org.scalatest.matchers.should.Matchers

class UrlifySpec extends AnyFreeSpec with Matchers {

  "when string only contains whitespace then returns the input" in {
    urlify("      ") shouldBe "      "
  }

  "when string is okey then returns the url version of it" in {
    urlify("Mr John Smith      ") shouldBe "Mr%20John%20Smith"
  }
}
