import Partition.partition
import org.scalatest.freespec.AnyFreeSpec
import org.scalatest.matchers.should.Matchers

class PartitionSpec extends AnyFreeSpec with Matchers {

  "when list is empty then return empty list" in {
    partition(Iterator.empty[Int], 1) shouldBe List.empty[Int]
  }

  "when partition number is not in the list then return original list" in {
    partition(Iterator(1, 2), 3) shouldBe List(1, 2)
  }

  "when list contains only the partition number then return original list" in {
    partition(Iterator(2, 2, 2), 2) shouldBe List(2, 2, 2)
  }

  "when list's size is odd then return the smaller numbers on the left and bigger on the right compare to the partition number" in {
    partition(Iterator(5, 3, 4, 2, 1), 3) shouldBe List(1, 2, 3, 4, 5)
  }

  "when list's size is even then return the smaller numbers on the left and bigger on the right compare to the partition number" in {
    partition(Iterator(5, 3, 4, 2, 1, 6), 3) shouldBe List(1, 2, 3, 4, 5, 6)
  }
}
