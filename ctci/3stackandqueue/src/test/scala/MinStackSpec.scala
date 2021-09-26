import org.scalatest.freespec.AnyFreeSpec
import org.scalatest.matchers.should.Matchers
import stack.MinStack

class MinStackSpec extends AnyFreeSpec with Matchers {

  "when stack is empty and pop then return None" in {
    MinStack().pop shouldBe None
  }

  "when value is pushed and popped then return it with the min" in {
    val s = MinStack()
    s.push(4)
    s.pop shouldBe Some((4, 4))
  }

  "when values are pushed and popped then return them with the corresponding mins" in {
    val s = MinStack()
    s.push(4)
    s.push(3)
    s.push(6)
    s.pop shouldBe Some((6, 3))
    s.pop shouldBe Some((3, 3))
    s.push(6)
    s.push(2)
    s.push(1)
    s.pop shouldBe Some((1, 1))
    s.pop shouldBe Some((2, 2))
    s.pop shouldBe Some((6, 4))
    s.pop shouldBe Some((4, 4))
    s.pop shouldBe None
  }
}
