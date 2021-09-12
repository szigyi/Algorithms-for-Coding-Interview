object StringRotation {

  def isSubstring(s1: String, s2: String): Boolean = {
    if (s1.length != s2.length || s1.isEmpty) false
    else {
      var found = false
      var i = 0
      while (i < s1.length && !found) {
        val split = s1.splitAt(i)
        val recombined = split._2 + split._1
        if (s2.equals(recombined)) {
          found = true
        }
        i += 1
      }
      found
    }
  }
}
