package exercise2

import org.scalatest.FunSuite
import RecursiveFunctions._

import scala.collection.immutable.List

class RecursiveFuncTest extends FunSuite {

  test("length returns lenght of the passed list") {
    assert(length(List(1, 2, 3)) == 3)
  }

  test("reverse takes a list and returns same but reversed list") {
    assert(reverse(List(1, 2, 3)) == List(3, 2, 1))
  }

  test("testReverse takes a list and returns same but reversed list") {
    assert(testReverse(List(1, 2, 3)) == List(3, 2, 1))
  }

  test("Map should apply given function to each element of the passed list") {
    assert(Map(List(1, 2, 3))((x: Int) => x * 2) == List(2, 4, 6))
  }

  test("testMap should apply given function to each element of the passed list") {
    assert(testMap(List(1, 2, 3), (x: Int) => x * 2) == List(2, 4, 6))
  }

  test("Append concatenates two lists") {
    assert(Append(List(1, 2, 3), List(4, 5, 6)) == List(1, 2, 3, 4, 5, 6))
  }

  test("testAppend concatenates two lists") {
    assert(testAppend(List(1, 2, 3), List(4, 5, 6)) == List(1, 2, 3, 4, 5, 6))
  }

  test("FlatMap applies given function to each element of the passed list") {
    assert(FlatMap(List(2, 3, 4))((x:Int) => List.range(1, x)) == List(1, 1, 2, 1, 2, 3))
  }

  test("testFlatMap applies function to each element of the passed list") {
    assert(testFlatMap(List(2, 3, 4), (x:Int) => List.range(1, x)) == List(1, 1, 2, 1, 2, 3))
  }
}
