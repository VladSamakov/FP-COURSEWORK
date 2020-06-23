package exercise4

import org.scalatest.FunSuite
import exercise4.program.Typeclasses._

class TypeClassesTest extends FunSuite {

  test("testReversableString should return reversed string") {
    assert(testReversableString("reverse") == "esrever")
  }

  test("smash should add integer numbers and multiply double numbers") {
    assert(smash(32, 3) == 35)
    assert(smash(2.5, 4.0) == 10.0)
    assert(smash("Concat", "String") == "ConcatString")
  }

  test("testSmashInt should add integer numbers") {
    assert(testSmashInt(32, 3) == 35)
  }

  test("testSmashDouble should multiply double numbers") {
    assert(testSmashDouble(2.5, 4.0) == 10.0)
  }

  test("testSmashString should concatenate strings") {
    assert(testSmashString("Concat", "String") == "ConcatString")
  }



}
