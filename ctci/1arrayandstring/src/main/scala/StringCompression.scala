import scala.collection.mutable.Stack

object StringCompression {

  def compress(s: String): String = {
    val builder = Stack[Char]()
    var counter = 0
    s.map { ch =>
      if (builder.isEmpty) {
        counter += 1
        builder.addOne(ch)
      } else if (builder.last == ch) {
        counter += 1
      } else {
        builder.addOne(counter.toString.toCharArray.head)
        builder.addOne(ch)
        counter = 1
      }
    }
    builder.addOne(counter.toString.toCharArray.head)
    val array = builder.popAll().reverse
    println(array)
    if (array.size > s.size) s
    else new String(array.toArray)
  }
}
