package P02

import org.scalatest._
import flatspec._
import matchers._
import P02._


class P02Spec extends AnyFlatSpec with should.Matchers {

  behavior of "A makeChange() function"

  it should "return the number of coins you use to make a given amount of change" +
    "using face value 1, 5, 10, 25, 100 or 500 " in {
    makeChange(0) shouldBe 0
    makeChange(12) shouldBe 3
    makeChange(468) shouldBe 11
    makeChange(123456) shouldBe 254
  }

}
