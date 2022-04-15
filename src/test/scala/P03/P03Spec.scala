package P03

import org.scalatest._
import flatspec._
import matchers._
import P03._


class P03Spec extends AnyFlatSpec with should.Matchers {

  behavior of "An isPossible() function"

  it should "return true if meetings were possible " in {
    isPossible(Seq(5, 3, 0, 2, 6, 2, 0, 7, 2, 5)) shouldBe false
    isPossible(Seq(4, 2, 0, 1, 5, 0)) shouldBe false
    isPossible(Seq(3, 1, 2, 3, 1, 0)) shouldBe true
    isPossible(Seq(16, 9, 9, 15, 9, 7, 9, 11, 17, 11, 4, 9, 12, 14, 14, 12, 17, 0, 3, 16)) shouldBe true
    isPossible(Seq(14, 10, 17, 13, 4, 8, 6, 7, 13, 13, 17, 18, 8, 17, 2, 14, 6, 4, 7, 12)) shouldBe true
    isPossible(Seq(15, 18, 6, 13, 12, 4, 4, 14, 1, 6, 18, 2, 6, 16, 0, 9, 10, 7, 12, 3)) shouldBe false
    isPossible(Seq(6, 0, 10, 10, 10, 5, 8, 3, 0, 14, 16, 2, 13, 1, 2, 13, 6, 15, 5, 1)) shouldBe false
    isPossible(Seq(2, 2, 0)) shouldBe false
    isPossible(Seq(3, 2, 1)) shouldBe false
    isPossible(Seq(1, 1)) shouldBe true
    isPossible(Seq(1)) shouldBe false
    isPossible(Seq()) shouldBe true
  }

}