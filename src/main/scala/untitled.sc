import scala.math.Integral.Implicits.infixIntegralOps

val num = 12345
'1'.toInt
'2'.toInt
'3'.toInt
'4'.toInt

num.toString.map(_.toInt - 48).sum

val (x,r) = 468/%500

val num = Seq(1,2,3,4)

val input = List(3, 1, 2, 3, 1, 0)
input.splitAt(3)._1.map(_-1)

"head".head