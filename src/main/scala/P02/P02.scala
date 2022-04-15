package P02

import scala.math.Integral.Implicits.infixIntegralOps

object P02 {

  def makeChange(value: Int): Int = {
    Seq(1, 5, 10, 25, 100, 500).reverse.foldLeft((0, value)) { (result, currency) =>
      val (ncoins, rest) = result._2 /% currency
      (ncoins + result._1, rest)
    }._1
  }

}
