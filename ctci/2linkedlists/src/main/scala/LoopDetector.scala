import scala.collection.mutable

object LoopDetector {

  def loopDetector(ll: List[Int]): Option[Int] = {
    val seen = mutable.Set[Int]()
    var value: Option[Int] = None
    val iter = ll.iterator

    while (value.isEmpty && iter.hasNext) {
      val i = iter.next()
      if (seen.contains(i)) value = Some(i)
      else seen.addOne(i)
    }
    value
  }
}
