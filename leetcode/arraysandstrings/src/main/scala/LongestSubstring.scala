import scala.collection.mutable
import scala.collection.mutable.ListBuffer

object LongestSubstring {

  def longestSubstring(str: String): Int = {
    def isThereAnotherDuplicateCharWithinRange(i: Int, j: Int, indices: Iterable[Set[Int]]): Boolean =
      indices.map { ixs =>
        ixs.count(index => index > i && index < j) > 1
      }.exists(_ == true)

    def biggestIndexDifference(indices: ListBuffer[Int], indicesCache: Iterable[Set[Int]]): Int = {
      var maxDistance = 0
      var prevPreviousIndex = -1
      var previousIndex = 0
      indices.map { i =>
        prevPreviousIndex match {
          case p if p >= 0 =>
            val distance = i - prevPreviousIndex - 1
            if (distance > maxDistance) {
              val subIndices = isThereAnotherDuplicateCharWithinRange(prevPreviousIndex, i, indicesCache)
              if (!subIndices) {
                println(s"subIndices:$subIndices, prevPreviousIndex:${prevPreviousIndex + 1}, previousIndex:$previousIndex, i:$i")
                maxDistance = distance
              }
            }
          case p =>
            val distance = i - previousIndex
            if (distance > maxDistance) {
              val subIndices = isThereAnotherDuplicateCharWithinRange(previousIndex, i, indicesCache)
              if (!subIndices) {
                println(s"subIndices:$subIndices, prevPreviousIndex:${prevPreviousIndex + 1}, previousIndex:$previousIndex, i:$i")
                maxDistance = distance
              }
            }
        }
        prevPreviousIndex = previousIndex
        previousIndex = i
      }
      println(s"maxDistance:$maxDistance, indices:$indices")
      maxDistance
    }

    val chars = mutable.Map[Char, ListBuffer[Int]]()
    str.zipWithIndex.map { case (c, i) =>
      if (chars.contains(c)) {
        chars(c).addOne(i)
      } else {
        chars.addOne(c, ListBuffer[Int](i))
      }
    }
    println(s"chars:$chars")
    val duplicates = chars.values.filter(_.size > 1)
    println(s"duplicates:$duplicates")
    val indicesCache = duplicates.map(_.toSet)
    if (duplicates.isEmpty) str.size
    else duplicates.map(indices => biggestIndexDifference(0 +: indices :+ str.length, indicesCache)).max
  }

//  def longestSubstring(str: String): Int = {
//    def longest(s: String): Int = {
//      val uniqueChars = mutable.Set[Char]()
//      var startIndex = 0
//      var maxLength = 0
//      s.zipWithIndex.map { case (c, i) =>
//        if (uniqueChars.contains(c)) {
//          val currentLength = i - startIndex
//          if (currentLength > maxLength) maxLength = currentLength
//          startIndex = i
//        } else {
//          val currentLength = (i + 1) - startIndex
//          if (currentLength > maxLength) maxLength = currentLength
//        }
//        uniqueChars.add(c)
//        println(s"maxLength:$maxLength, startIndex:$startIndex, uniqueChars:$uniqueChars")
//      }
//      maxLength
//    }
//    Math.max(longest(str), longest(str.reverse))
//  }
}