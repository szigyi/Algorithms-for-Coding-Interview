import scala.collection.mutable

object SumLists {
  def toReversedInt(l: List[Int]): Int = {
    var number: Double = 0
    var i = 0

    for (n <- l) {
      val digitNumber = n * Math.pow(10, i)
      number += digitNumber
      i += 1
    }
    number.toInt
  }

  def numberOfDigit(n: Int): Int = {
    var number = n
    var count = 0
    while (number != 0) {
      number /= 10
      count += 1
    }
    count
  }

  def toReversedList(n: Int): List[Int] =
    if (n == 0) List(n)
    else {
      val l = mutable.Stack[Int]()
      var i = numberOfDigit(n) - 1
      var number: Double = n

      while (i >= 0) {
        val digit = Math.pow(10, i)
        val div = number / digit
        l.addOne(div.toInt)
        i -= 1
        number = number % digit
      }
      l.popAll().toList
    }

  def sum(l1: List[Int], l2: List[Int]): List[Int] =
    if (l1.isEmpty) l2
    else if (l2.isEmpty) l1
    else {
      val n1 = toReversedInt(l1)
      val n2 = toReversedInt(l2)
      toReversedList(n1 + n2)
    }
}
