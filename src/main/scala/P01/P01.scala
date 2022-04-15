package P01

import scala.annotation.tailrec

object P01 {

  @tailrec
  def addItsDigits(num: Int, nloop: Int): Int = num match {
    case n if (1 to 9).contains(n) => nloop
    case n => addItsDigits(n.toString.map(_.toInt - 48).sum, nloop + 1)
  }

}
