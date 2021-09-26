package stack

private[stack] case class StackNode[T](value: T, next: Option[StackNode[T]] = None)
