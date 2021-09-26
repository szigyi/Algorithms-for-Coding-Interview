package stack

case class MinStack() {
  private var top: Option[StackNode[Int]] = None
  private var min: Option[StackNode[Int]] = None

  def push(v: Int): Unit = {
    val newTop = StackNode(v, top)
    top = Some(newTop)
    min = min match {
      case Some(oldMin) =>
        if (v < oldMin.value) Some(StackNode(v, min))
        else Some(StackNode(oldMin.value, min))
      case None =>
        Some(StackNode(v, min))
    }
  }

  def pop: Option[(Int, Int)] = {
    val value = top.flatMap { t =>
      min.map { m =>
        (t.value, m.value)
      }
    }
    top = top.flatMap(_.next)
    min = min.flatMap(_.next)
    value
  }
}
