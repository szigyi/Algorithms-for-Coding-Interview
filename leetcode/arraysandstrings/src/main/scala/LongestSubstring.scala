import scala.collection.mutable

object LongestSubstring {

  def longestSubstring(str: String): Int = {
    val chars = mutable.Map[Char, Int]()
    var ans = 0
    var start = 0
    var currentIndex = 0

    while (currentIndex < str.length) {
      val char = str.charAt(currentIndex)
      if (chars.contains(char)) {
        start = math.max(chars(char), start)
      }
      val length = currentIndex - start + 1
      ans = math.max(ans, length)
      chars.addOne(char, currentIndex + 1)
      currentIndex += 1
    }
    ans
  }
}