import scala.collection.mutable.Stack

object Urlify {

  def urlify(s: String): String = {
    if (s.isBlank) s
    else {
      var onlyWhiteSpaceYet = true
      val stack = Stack[Char]()

      for (c <- s.reverse.toCharArray) {
        (c, onlyWhiteSpaceYet) match {
          case (ch, true) if ch != ' ' =>
            onlyWhiteSpaceYet = false
            stack.addOne(c)
          case (' ', false) =>
            stack.addAll("02%")
          case (ch, false) =>
            stack.addOne(ch)
          case (d, f) =>
        }
      }
      new String(stack.popAll().toArray)
    }
  }
}
