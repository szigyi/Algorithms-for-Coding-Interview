object RotateMatrix {

  def rightRotation(m: Array[Array[Int]]): Array[Array[Int]] =
    if (m.isEmpty || m(0).isEmpty || m.length != m(0).length) m
    else (for {
      rowIndex <- 0 until m.length
      columnIndex <- 0 until m.length
    } yield {
      val rightColumnIndex = rowIndex
      val rightRowIndex = m.length - 1 - columnIndex
      m(rightRowIndex)(rightColumnIndex)
    }).sliding(m.length, m.length).map(_.toArray).toArray
}
