import SumLists.{numberOfDigit, sum, toReversedInt, toReversedList}
import org.scalatest.freespec.AnyFreeSpec
import org.scalatest.matchers.should.Matchers

class SumListsSpec extends AnyFreeSpec with Matchers {

  "toReversedInt" - {
    "when number is 1 digit long" in {
      toReversedInt(List(5)) shouldBe 5
    }

    "when number is long" in {
      toReversedInt(List(0, 5, 4, 3, 2, 1)) shouldBe 123450
    }
  }

  "numberOfDigit" - {
    "when short" in {
      numberOfDigit(1) shouldBe 1
    }

    "when long" in {
      numberOfDigit(123456789) shouldBe 9
    }
  }

  "toReversedList" - {
    "when number is 0 then return it as list" in {
      toReversedList(0) shouldBe List(0)
    }

    "when number is short" in {
      toReversedList(5) shouldBe List(5)
    }

    "when number is long" in {
      toReversedList(123450) shouldBe List(0, 5, 4, 3, 2, 1)
    }
  }

  "sum" - {
    "when one list is empty then return other list" in {
      sum(List.empty[Int], List(1, 2)) shouldBe List(1, 2)
    }

    "when both lists are empty then return empty list" in {
      sum(List.empty[Int], List.empty[Int]) shouldBe List.empty[Int]
    }

    "can handle small, short numbers" in {
      sum(List(3, 2), List(6, 1)) shouldBe List(9, 3)
    }

    "can handle big, long numbers" in {
      sum(List(3, 2, 4, 1, 6, 3), List(6, 1, 2, 9, 1)) shouldBe List(9, 3, 6, 0, 8, 3)
    }
  }

}
