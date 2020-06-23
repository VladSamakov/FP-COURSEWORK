package exercise3

import org.scalatest.FunSuite
import Maps._

class MapsTest extends FunSuite {
  val Frodo = User("Frodo", 15)
  val Legolas1 = User("Legolas", 1000)
  val Legolas2 = User("Legolas", 500)

  val map = Map("Frodo" -> Frodo, "Legolas" -> Legolas1, "Legolas" -> Legolas2)
  val seq = Seq(Frodo, Legolas1, Legolas2)

  test("testGroupUsers should group users by name and calculate average age of each group") {
    assert(testGroupUsers(seq) == Map("Frodo" -> 15, "Legolas" -> 750))
  }

  test("testNumberFrodos counts \"Adam\" count in passed map[String->User]") {
    assert(testNumberFrodos(Map("Frodo" -> Frodo, "Adam" -> User("Adam", 40))) == 1)
  }

  test("testUnderaged removes from the map all users under 35 years old") {
    assert(testUnderaged(map) == Map("Legolas" -> Legolas1, "Legolas" -> Legolas2))
  }

}
