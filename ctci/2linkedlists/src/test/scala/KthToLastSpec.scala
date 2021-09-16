import KthToLast.kthToLast
import org.scalatest.freespec.AnyFreeSpec
import org.scalatest.matchers.should.Matchers

class KthToLastSpec extends AnyFreeSpec with Matchers {

  "when list is empty then return None" in {
    val ll = List.empty[Int]
    val k = 2

    kthToLast(ll, k) shouldBe None
  }

  "when k is the size of list then return None" in {
    val ll = List(1, 2)
    val k = 2

    kthToLast(ll, k) shouldBe None
  }

  "when k is negative then return None" in {
    val ll = List(1, 2)
    val k = -1

    kthToLast(ll, k) shouldBe None
  }

  "when k is 0 then return last element of the list" in {
    val ll = List(1, 2, 3)
    val k = 0

    kthToLast(ll, k) shouldBe Some(3)
  }

  "when k is the size of the list but -1 then return first element of the list" in {
    val ll = List(1, 2, 3)
    val k = 2

    kthToLast(ll, k) shouldBe Some(1)
  }
}
