package exercise3

import org.scalatest.FunSuite
import Sequence._

class SequenceTest extends FunSuite {

  test("testLastElement returns last element of the sequence") {
    assert(testLastElement(Seq(1, 2, 3, 4)) == Some(4))
  }

  test("testZip zips combines two sequences") {
    assert(testZip(Seq(1, 2), Seq(3, 4)) == Seq((1, 3), (2, 4)))
  }

  test("testForAll checks codition for all elements") {
    assert(testForAll(Seq(1, 2, 3, 4))((x: Int) => x < 5) == true)
  }

  test("testPalindrom returns true if sequence is palindrom and false otherwise") {
    assert(testPalindrome(Seq(1, 2, 3, 4)) == false)
    assert(testPalindrome(Seq(1, 2, 2, 1)) == true)
  }

  test("testFlatMap should apply function to each element of the sequence") {
    assert(testFlatMap(Seq(1, 2, 3, 4))((x: Int) => Seq.range(1, x)) == Seq(1, 1, 2, 1, 2, 3))
  }
}
