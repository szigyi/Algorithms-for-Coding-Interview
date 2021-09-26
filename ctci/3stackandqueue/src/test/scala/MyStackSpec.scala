import org.scalatest.freespec.AnyFreeSpec
import org.scalatest.matchers.should.Matchers
import stack.MyStack

class MyStackSpec extends AnyFreeSpec with Matchers {

  "when Stack is empty and pop then return None" in {
    MyStack().pop shouldBe None
  }

  "when value is pushed then pop returns it and nothing more" in {
    val s = MyStack[Int]()
    s.push(1)
    s.pop shouldBe Some(1)
    s.pop shouldBe None
  }

  "when values are pushed then pop returns them and nothing more" in {
    val s = MyStack[Int]()
    s.push(1)
    s.pop shouldBe Some(1)
    s.push(3)
    s.push(5)
    s.push(8)
    s.pop shouldBe Some(8)
    s.pop shouldBe Some(5)
    s.pop shouldBe Some(3)
    s.pop shouldBe None
  }
}
