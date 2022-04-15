package P01

import org.scalatest._
import flatspec._
import matchers._
import P01._


class P01Spec extends AnyFlatSpec with should.Matchers {

  behavior of "An addItsDigits() function"

  it should "return calculates the additive persistence of a number" in {
    addItsDigits(13, 0) shouldBe 1
    addItsDigits(1234, 0) shouldBe 2
    addItsDigits(9876, 0) shouldBe 2
    addItsDigits(199, 0) shouldBe 3
  }

}
