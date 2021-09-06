import scala.collection.mutable.HashMap

object PalindromePermutation {

  def isPalindromeViaPermutation(s: String): Boolean = {
    if (s.isEmpty) false
    else {
      val charFlag = HashMap[Char, Boolean]()
      s.toLowerCase.map { ch =>
        if (charFlag.contains(ch)) charFlag.update(ch, !charFlag(ch))
        else charFlag.addOne(ch -> true)
      }
      if (s.size % 2 == 0) !charFlag.values.exists(odd => odd == true)
      else charFlag.values.count(odd => odd == true) == 1
    }
  }
}
