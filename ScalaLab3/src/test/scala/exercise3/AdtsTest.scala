package exercise3

import org.scalatest.FunSuite
import Adts._


class AdtsTest extends FunSuite{

  test("testGetNth should return n-th element of the list") {
    assert(testGetNth(List(1, 2, 3, 4), 2) == Some(3))
  }

  test("Double should return doubled number and None if None is passed") {
    assert(Double(Some(2)) == Some(4))
    assert(Double(None) == None)
  }

  test("testDouble should return double number and None if None is passed") {
    assert(testDouble(Some(2)) == Some(4))
    assert(testDouble(None) == None)
  }

  test("IsEven should return passed number if it's even and string \"Odd number\" otherwise") {
    assert(IsEven(6) == Right(6))
    assert(IsEven(7) == Left("Odd number"))
  }

  test("testIsEven should return passed number if it's even and string \"Odd number\" otherwise") {
    assert(testIsEven(6) == Right(6))
    assert(testIsEven(7) == Left("Odd number"))
  }

  test("SafeDivide should divide two numbers unless divisor is 0") {
    assert(SafeDivide(20, 2) == Right(10))
    assert(SafeDivide(20, 0) == Left("Cannot divide by zero"))
  }

  test("testSafeDivide should divide two numbers unless divisor is 0") {
    assert(testSafeDivide(20, 2) == Right(10))
    assert(testSafeDivide(20, 0) == Left("Cannot divide by zero"))
  }

  def impureFunc(str: String): Int = {
    10/0
  }

  def pureFunc(str: String): Int = {
    10
  }

  test("GoodOldJava should return Try[Int]") {
    assert(GoodOldJava(impureFunc, "Hello, world!") != util.Success(10))
  }

  test("testGoodOldJava should return Try[Int]") {
    assert(testGoodOldJava(pureFunc, "Hello, world!") == util.Success(10))
  }

}
