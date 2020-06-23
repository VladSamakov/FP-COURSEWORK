package exercise1

import org.scalatest._

class PatternsTest extends FunSuite {

  test("IntToString recognizes numbers from 1 to 3 inclusively") {
    assert(PatternMatching.IntToString(1) == "it is one")
    assert(PatternMatching.IntToString(2) == "it is two")
    assert(PatternMatching.IntToString(3) == "it is three")
    assert(PatternMatching.IntToString(5) == "what's that")
  }

  test("testIntToString calls IntToString with given parameters") {
    assert(PatternMatching.testIntToString(1) == "it is one")
    assert(PatternMatching.testIntToString(2) == "it is two")
    assert(PatternMatching.testIntToString(3) == "it is three")
    assert(PatternMatching.testIntToString(5) == "what's that")
  }

  test("IsMaxAndMoritz recognizes (M)max and (M)moritz") {
    assert(PatternMatching.IsMaxAndMoritz("max") &&
    PatternMatching.IsMaxAndMoritz("Max") &&
    PatternMatching.IsMaxAndMoritz("moritz") &&
    PatternMatching.IsMaxAndMoritz("Moritz")  == true)

    assert(PatternMatching.IsMaxAndMoritz("notMax")  == false)
  }

  test("testIsMaxAndMoritz calls IsMaxAndMoritz with given parameter") {
    assert(PatternMatching.testIsMaxAndMoritz("max") &&
      PatternMatching.testIsMaxAndMoritz("Max") &&
      PatternMatching.testIsMaxAndMoritz("moritz") &&
      PatternMatching.testIsMaxAndMoritz("Moritz")  == true)

    assert(PatternMatching.testIsMaxAndMoritz("notMax")  == false)
  }

  test("isEven returns true if number is even and false otherwise") {
    assert(PatternMatching.IsEven(100)  == true)
    assert(PatternMatching.IsEven(13)  == false)
  }

  test("testIsEven calls isEven with given parameter") {
    assert(PatternMatching.testIsEven(100)  == PatternMatching.IsEven(100))
    assert(PatternMatching.testIsEven(13)  == PatternMatching.IsEven(13))
  }

  test("winsA returns rock-paper-scissor game result for first player") {
    assert(PatternMatching.WinsA(PatternMatching.Rock, PatternMatching.Rock)  == PatternMatching.Draw)
    assert(PatternMatching.WinsA(PatternMatching.Rock, PatternMatching.Paper)  == PatternMatching.Lose)
    assert(PatternMatching.WinsA(PatternMatching.Rock, PatternMatching.Scissor)  == PatternMatching.Win)
    assert(PatternMatching.WinsA(PatternMatching.Paper, PatternMatching.Rock)  == PatternMatching.Win)
    assert(PatternMatching.WinsA(PatternMatching.Paper, PatternMatching.Paper)  == PatternMatching.Draw)
    assert(PatternMatching.WinsA(PatternMatching.Paper, PatternMatching.Scissor)  == PatternMatching.Lose)
    assert(PatternMatching.WinsA(PatternMatching.Scissor, PatternMatching.Rock)  == PatternMatching.Lose)
    assert(PatternMatching.WinsA(PatternMatching.Scissor, PatternMatching.Paper)  == PatternMatching.Win)
    assert(PatternMatching.WinsA(PatternMatching.Scissor, PatternMatching.Scissor)  == PatternMatching.Draw)
  }

  test("testWinsA calls winsA with given parameters") {
    assert(PatternMatching.testWinsA(PatternMatching.Rock, PatternMatching.Scissor)  ==
    PatternMatching.WinsA(PatternMatching.Rock, PatternMatching.Scissor))
  }

  test("extractMammalWeight returns mammal's weight and -1 if not mammal is passed") {
    assert(PatternMatching.ExtractMammalWeight(PatternMatching.Mammal("cat", PatternMatching.Meat, 5))  == 5)
    assert(PatternMatching.ExtractMammalWeight(PatternMatching.Fish("goldfish", PatternMatching.Vegetables))  == -1)
  }

  test("testExtractMammalWeight calls extractMammalWeight with given parameter") {
    assert(PatternMatching.testExtractMammalWeight(PatternMatching.Mammal("cat", PatternMatching.Meat, 5))  == 5)
    assert(PatternMatching.testExtractMammalWeight(PatternMatching.Fish("goldfish", PatternMatching.Vegetables))  == -1)
  }

  test("updateFood changes animal food") {
    val fish = PatternMatching.Fish("goldfish", PatternMatching.Plants)
    PatternMatching.UpdateFood(fish)
    assert(fish.food  == PatternMatching.Plants)

    val bird = PatternMatching.Bird("parrot", PatternMatching.Vegetables)
    PatternMatching.UpdateFood(bird)
    assert(bird.food  == PatternMatching.Plants)
  }

  test("testUpdateFood calls updateFood with given parameter") {
    val fish = PatternMatching.Fish("goldfish", PatternMatching.Vegetables)
    PatternMatching.testUpdateFood(fish)
    assert(fish.food  == PatternMatching.Plants)
  }


}
