import scala.collection.mutable.ListBuffer

object Partition {

  def partition(ll: Iterator[Int], partition: Int): List[Int] = {
    val l = ListBuffer[Int]()
    val r = ListBuffer[Int]()

    while (ll.hasNext) {
      val n = ll.next()
      if (n < partition) l.addOne(n)
      else r.addOne(n)
    }
    (l.sorted ++ r.sorted).toList
  }

}
