package exercise2


import org.scalatest.FunSuite

class CompositionTest extends FunSuite {

  test("testCompose should compose given functions") {
    assert(Compositions.testCompose((i:Int) => "test" * i)((i: String) => i * 2)
    ((i:String) => i.dropRight(3))(2) == "testtesttestt")
  }

  test("testFlatMap should compose given functions") {
    assert(Compositions.testMapFlatMap((i:Int) => if (i > 0) Some(i) else None)
    ((i:Int) => if (i > 10) Some(i) else None)
    ((i:Int) => i * 2)(Some(-1)) == None)
  }

  test("testForComprehension should compose given functions") {
    assert(Compositions.testForComprehension((i:Int) => if (i > 0) Some(i) else None)
    ((i:Int) => if (i > 10) Some(i) else None)
    ((i:Int) => i * 2)(Some(11)) == Some(22))
  }

}
