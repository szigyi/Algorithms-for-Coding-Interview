package stack

case class MyStack[T]() {

  private var top: Option[StackNode[T]] = None

  def push(v: T): Unit = {
    val newTop = StackNode(v, top)
    top = Some(newTop)
  }

  def pop: Option[T] = {
    val value = top.map(_.value)
    top = top.flatMap(_.next)
    value
  }
}