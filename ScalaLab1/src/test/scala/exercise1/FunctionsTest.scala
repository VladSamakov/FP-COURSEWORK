package exercise1

import org.scalatest.FunSuite

class FunctionsTest extends FunSuite {
  test("CircleArea calculates circle area")  {
    assert(Functions.Circle(6) == 6 * 6 * Math.PI)
  }

  test("testCircle calls circleArea with given radius")  {
    assert(Functions.testCircle(6) == 6 * 6 * Math.PI)
  }

  test("RectangleArea calculates area of the given rectangle")  {
    assert(Functions.RectangleUc(5, 10) == 50)
  }

  test("testRectangleUc calls RectangleArea with given parameters")  {
    assert(Functions.testRectangleUc(10, 5) == 50)
  }

  test("RectangleAreaCurried calculates area of the given rectangle")  {
    assert(Functions.RectangleCurried(5)(10) == 50)
  }

  test("testRectangleCurried calls RectangleAreaCurried with given parameters")  {
    assert(Functions.testRectangleCurried(5, 10) == 50)
  }
}
