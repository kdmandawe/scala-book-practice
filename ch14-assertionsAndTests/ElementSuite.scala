import org.scalatest.FunSuite
import Element.elem

class ElementSuite extends FunSuite {

  test("elem result should have passed width") {
    val ele = elem('x', 2, 3)
    assert(ele.width == 2)
  }

  test("informative error message") {
    val width = 3
    assert(width == 2)
  }

  test("display as diagram") {
    assert(List(1, 2, 3).contains(4))
  }

  test("assertResult") {
    val width = 3
    assertResult(2) {
      width
    }
  }

  test("throws an expected exception") {
    assertThrows[IllegalArgumentException] {
      elem('x', -2, 3)
    }
  }

  test("intercept") {
    val caught =
      intercept[ArithmeticException] {
        1 / 0
      }

    assert(caught.getMessage == "/ by zero")
  }
}
