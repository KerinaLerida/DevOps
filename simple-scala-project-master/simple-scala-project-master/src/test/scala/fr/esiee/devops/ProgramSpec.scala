package fr.esiee.devops

import fr.esiee.devops.program.Program
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class ProgramSpec extends AnyFlatSpec with Matchers {

  //TODO: Fixme
  "Fibonacci" should "return the expected results" in {
    Map(
      0 -> 0,
      1 -> 1,
      2 -> 1,
      3 -> 2,
      7 -> 14
    ).foreach{case (i, expected) =>
      Program.fibonacci1(i) shouldBe expected
    }
  }

  //TODO: Implement tests
  "lpadZeros" should "return the expected results" in {
    Map(
      (7, 3) -> "007",
      (18, 2) -> "18",
      (121, 2) -> "12",
      (-1, 5) -> "-00001"
    ).foreach { case ((i, length), expected) =>
      Program.lpadZeros(i, length) shouldBe expected
    }
  }

  //TODO: Implement tests
  "isPrimeNumber" should "return the expected results" in {
    Map(
      0 -> false,
      1 -> false,
      2 -> true,
      3 -> true,
      4 -> false,
      5 -> true,
      7 -> true,
      10 -> false
    ).foreach { case (i, expected) =>
      Program.isPrimeNumber(i) shouldBe expected
    }
  }

}
