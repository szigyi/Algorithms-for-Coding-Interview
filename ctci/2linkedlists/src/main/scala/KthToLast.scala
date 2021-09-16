object KthToLast {

  def kthToLast(ll: List[Int], k: Int): Option[Int] = {
    Option.when(k >= 0 && k < ll.size) {
      val i = ll.size - 1 - k
      ll(i)
    }
  }
}
