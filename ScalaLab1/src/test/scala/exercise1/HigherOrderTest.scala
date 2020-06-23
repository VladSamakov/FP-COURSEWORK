package exercise1

import org.scalatest.FunSuite

class HigherOrderTest extends FunSuite {

  test("nTimes multiplies function result by n") {
    assert(HigherOrder.nTimes((a: Int, b:Int) => a + b, 3, 3, 4) == 24)
  }
  test("testNtimes calls nTimes with given parameters") {
    assert(HigherOrder.testNTimes((a: Int, b: Int) => a + b,  3, 3, 4)  == 24)
  }

  test("testAnonymousNTimes calls nTimes with given parameters and hardcoded function") {
    assert(HigherOrder.testAnonymousNTimes(2, 3, 4)  == 12)
    assert(HigherOrder.testAnonymousNTimes(3, 2, 4)  == 12)
  }


}
