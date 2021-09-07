object OneAway {

  def oneAway(s1: String, s2: String): Boolean = {
    s1.size - s2.size match {
      case 0 =>
        println("replace")
        val charEqualsMap = s1.zip(s2).map { case (c1, c2) =>
          println(s"$c1 == $c2 => ${c1 == c2}")
          c1 == c2
        }
        charEqualsMap.count(_ == false) == 1
      case -1 =>
        println("insert into s1")
        oneInsertAway(s2, s1)
      case 1 =>
        println("insert into s2")
        oneInsertAway(s1, s2)
      case _ =>
        println("default")
        false
    }
  }

  private def oneInsertAway(longerStr: String, shorterStr: String): Boolean = {
    var similar = true
    var finished = false
    var oneEditYet = true
    var i = 0
    var j = 0
    while (similar && !finished) {
      if (i >= longerStr.size) {
        finished = true
      } else if (longerStr(i) == shorterStr(j)) {
        println(s"${longerStr(i)} == ${shorterStr(j)}")
        i += 1
        j += 1
      } else if (oneEditYet && longerStr(i+1) == shorterStr(j)) {
        println(s"one edit used && ${longerStr(i+1)} == ${shorterStr(j)}")
        i += 2
        j += 1
        oneEditYet = false
      } else {
        similar = false
      }
    }
    similar
  }
}
