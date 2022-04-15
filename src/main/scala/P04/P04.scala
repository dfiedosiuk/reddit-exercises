package P04

object P04 {
  def addToDigitOne(n: Int): Int = {
    val addOne = Map(
      ('0', '1'),
      ('1', '2'),
      ('2', '3'),
      ('3', '4'),
      ('4', '5'),
      ('5', '6'),
      ('6', '7'),
      ('7', '8'),
      ('8', '9'),
      ('9', "10")
    )
    n.toString.map(addOne).mkString.toInt
  }
}
