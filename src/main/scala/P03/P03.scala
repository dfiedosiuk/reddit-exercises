package P03

object P03 {

  def isPossible(hh: Seq[Int]): Boolean = {
    val meetings = hh.filterNot(_ == 0).sorted.reverse

    def checkMettings(mts: Seq[Int]): Boolean = {
      println(mts)
      mts match {
        case Nil => true
        case m :: Nil => false
        case _ =>
          if(mts.head > mts.tail.length) false
          else {
            val (toReduce, rest) = mts.tail.splitAt(mts.head)
            val mtsReduced = toReduce.map(_ - 1) ++ rest
            checkMettings(mtsReduced.filterNot(_ == 0).sorted.reverse)
          }
      }
    }
    checkMettings(meetings)
  }

}
