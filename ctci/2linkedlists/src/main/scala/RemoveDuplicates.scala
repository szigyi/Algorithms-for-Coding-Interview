import scala.collection.mutable

object RemoveDuplicates {

  def removeDup(ll: List[Int]): List[Int] = {
    val set = mutable.Set[Int]()
    val buffer = mutable.ArrayBuffer[Int]()
    ll.map { elem =>
      if (!set.contains(elem)) {
        set.addOne(elem)
        buffer.addOne(elem)
      }
    }
    buffer.toList
  }
}