package exercise2

import org.scalatest.FunSuite

class RecursiveDataTest extends FunSuite{

  test("ListIntEmpty returns true if list is empty and false otherwise") {
    assert(RecursiveData.ListIntEmpty(Nil) == true)
    assert(RecursiveData.ListIntEmpty(List(1, 2, 3)) == false)
  }

  test("testListIntEmpty returns true if list is empty and false otherwise") {
    assert(RecursiveData.testListIntEmpty(Nil) == true)
    assert(RecursiveData.testListIntEmpty(List(1, 2, 3)) == false)
  }

  test("ListIntHead returns first element of the list and -1 if the list is empty") {
    assert(RecursiveData.ListIntHead(List(1, 2, 3)) == 1)
    assert(RecursiveData.ListIntHead(Nil) == -1)
  }

  test("testListIntHead returns first element of the list and -1 if the list is empty") {
    assert(RecursiveData.testListIntHead(List(1, 2, 3)) == 1)
    assert(RecursiveData.testListIntHead(Nil) == -1)
  }

  test("ListNotEmpty returns adds element to the list if it's empty") {
    assert(RecursiveData.ListNotEmpty(1, Nil) == List(1))
    assert(RecursiveData.ListNotEmpty(1, List(1, 2, 3)) == List(1, 2, 3))
  }

}
