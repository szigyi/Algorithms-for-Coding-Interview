import ZeroMatrix.spreadTheZero
import org.scalatest.freespec.AnyFreeSpec
import org.scalatest.matchers.should.Matchers

class ZeroMatrixSpec extends AnyFreeSpec with Matchers {

  "when matrix is empty then return original" in {
    val m: Array[Array[Int]] = Array(Array())

    spreadTheZero(m) shouldBe m
  }

  "when cell contains zero value then replace the row and column values with zero" in {
    val m: Array[Array[Int]] = Array(
      Array(1, 1, 1),
      Array(1, 1, 1),
      Array(1, 0, 1),
      Array(1, 1, 1)
    )

    spreadTheZero(m) shouldBe Array(
      Array(1, 0, 1),
      Array(1, 0, 1),
      Array(0, 0, 0),
      Array(1, 0, 1)
    )
  }

  "when multiple cells contains zero value then replace the row and column values with zero" in {
    val m: Array[Array[Int]] = Array(
      Array(1, 0, 1),
      Array(0, 0, 1),
      Array(1, 0, 1),
      Array(1, 1, 1)
    )

    spreadTheZero(m) shouldBe Array(
      Array(0, 0, 0),
      Array(0, 0, 0),
      Array(0, 0, 0),
      Array(0, 0, 1)
    )
  }
}
