import LoopDetector.loopDetector
import org.scalatest.freespec.AnyFreeSpec
import org.scalatest.matchers.should.Matchers

class LoopDetectorSpec extends AnyFreeSpec with Matchers {

  "when list is empty then return None" in {
    loopDetector(List.empty[Int]) shouldBe None
  }

  "when there is no loop in the list then return None" in {
    loopDetector(List(1, 2, 3, 4)) shouldBe None
  }

  "when there is a loop in the list then return the value where it starts" in {
    loopDetector(List(1, 2, 3, 4, 2, 5, 6)) shouldBe Some(2)
  }
}
