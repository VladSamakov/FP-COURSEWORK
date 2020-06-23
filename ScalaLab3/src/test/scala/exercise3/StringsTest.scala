package exercise3

import org.scalatest.FunSuite
import Strings._

class StringsTest extends FunSuite {

  test("testUppercase returns string with all capital letters") {
    assert(testUppercase("testString") == "TESTSTRING")
  }

  test("testInterpolation inserts given name and age into string") {
    assert(testInterpolations("Legolas", 750) == "Hi, my name is Legolas and I am 750 years old.")
  }

  test("testComputation inserts numbers into string") {
    assert(testComputation(5, 6) == "Hi,\n" +
      "now follows a quite hard calculation. We try to add:\n" +
      "  a := 5\n" +
      "  b := 6\n\n" +
      "  return 5 + 6")
  }

  test("testTakeTwo takes first two characters of the string") {
    assert(testTakeTwo("Substring") ==  "Su")
  }
}
