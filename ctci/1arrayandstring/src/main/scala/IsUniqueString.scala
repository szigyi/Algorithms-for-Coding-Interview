import scala.collection.mutable

object IsUniqueString {

  def isUnique(s: String): Boolean =
    if (s.isEmpty) false
    else s.toSet.size == s.length

  def isUniqueOfficial(s: String): Boolean = {
    if (s.length > 128) false
    else {
      val charset = mutable.ArrayBuffer[Boolean]()
      for { i <- 0 until s.length } yield {
        val c = s.charAt(i)
        if (charset(c)) return false
        else charset(c) = true
      }
      true
    }
  }
}
