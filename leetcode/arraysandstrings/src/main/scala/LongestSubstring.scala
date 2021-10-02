import scala.collection.mutable

object LongestSubstring {

  def longestSubstring(s: String): Int = {
    var uniqueChars = mutable.Set[Char]()
    var maxLength = 0
    var lengthOfUniqueString = 0
    s.map { c =>
      if (uniqueChars.contains(c)) {
        uniqueChars = mutable.Set[Char]()
        if (lengthOfUniqueString > maxLength) maxLength = lengthOfUniqueString
        uniqueChars.add(c)
        lengthOfUniqueString = 1
      } else {
        uniqueChars.add(c)
        lengthOfUniqueString += 1
      }
    }
    Math.max(lengthOfUniqueString, maxLength)
  }
}