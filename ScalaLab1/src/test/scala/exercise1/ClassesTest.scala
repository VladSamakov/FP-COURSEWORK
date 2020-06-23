package exercise1

import org.scalatest.FunSuite

class ClassesTest extends FunSuite {

  test("Animal.apply creates animal if valid parameter is passed") {
    assert(Animal.apply("parrot") == (Some(Animal.parrot)))
    assert(Animal.apply("cat") == (Some(Animal.cat)))
    assert(Animal.apply("goldfish") == (Some(Animal.goldfish)))
  }
  test("Animal.apply returns None if wrong parameter is passed") {
    assert(Animal.apply("wrong") == None)
  }

  test("KnownAnimal returns true if valid animal is passed") {
    assert(Animal.knownAnimal("cat") && Animal.knownAnimal("parrot") &&
    Animal.knownAnimal("goldfish") == true)
  }

  test("KnownAnimal returns false if invalid animal is passed") {
    assert(Animal.knownAnimal("lion") == false)
  }
  test("Animal.eats checks if animal eats given food") {
    val tiger = Mammals("tiger", "meat")
    assert(tiger.eats("plants") == false)
    assert(tiger.eats("meat") == true)
  }
}