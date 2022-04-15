package P04

import org.scalatest._
import flatspec._
import matchers._
import P04._


class P04Spec extends AnyFlatSpec with should.Matchers {

  behavior of "An addToDigitOne() function"

  it should "return the new number by adding one to each of its digit" in {
    addToDigitOne(0) shouldBe 1
    addToDigitOne(12) shouldBe 23
    addToDigitOne(99) shouldBe 1010
    addToDigitOne(998) shouldBe 10109
    addToDigitOne(909) shouldBe 10110
    addToDigitOne(999) shouldBe 101010
  }

}
