import RemoveDuplicates.removeDup
import org.scalatest.freespec.AnyFreeSpec
import org.scalatest.matchers.should.Matchers

class RemoveDuplicatesSpec extends AnyFreeSpec with Matchers {

  "when linked list is empty then returns original" in {
    val ll = List.empty[Int]

    removeDup(ll) shouldBe ll
  }

  "when linked list does not contain duplicates then returns original" in {
    val ll = List(1, 2, 3, 4, 5)

    removeDup(ll) shouldBe ll
  }

  "when linked list contains duplicates then returns only the unique elements" in {
    val ll = List(1, 2, 1, 4, 5, 2, 1, 4)

    removeDup(ll) shouldBe List(1, 2, 4, 5)
  }
}
