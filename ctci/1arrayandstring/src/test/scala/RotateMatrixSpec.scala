import RotateMatrix.rightRotation
import org.scalatest.freespec.AnyFreeSpec
import org.scalatest.matchers.should.Matchers

class RotateMatrixSpec extends AnyFreeSpec with Matchers {

  "when matrix is empty then returns original" in {
    val m: Array[Array[Int]] = Array(Array())

    rightRotation(m) shouldBe m
  }

  "when matrix is not a square one return original" in {
    val m = Array(Array(1, 2))

    rightRotation(m) shouldBe m
  }

  "when matrix is a square then rotates it to the right" in {
    val m = Array(
      Array(1, 2, 3),
      Array(4, 5, 6),
      Array(7, 8, 9)
    )

    rightRotation(m) shouldBe Array(
      Array(7, 4, 1),
      Array(8, 5, 2),
      Array(9, 6, 3)
    )
  }
}
