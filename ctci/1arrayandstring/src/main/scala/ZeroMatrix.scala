import scala.collection.mutable

object ZeroMatrix {

  def spreadTheZero(m: Array[Array[Int]]): Array[Array[Int]] = {
    val zeroRows = mutable.Set[Int]()
    val zeroColumns = mutable.Set[Int]()
    if (m.isEmpty || m(0).isEmpty) m
    else {
      for {
        row    <- 0 until m.length
        column <- 0 until m(0).length
      } yield {
        if (m(row)(column) == 0) {
          zeroRows.addOne(row)
          zeroColumns.addOne(column)
        }
      }
      (for {
        row    <- 0 until m.length
        column <- 0 until m(0).length
      } yield {
        if (zeroRows.contains(row) || zeroColumns.contains(column)) 0
        else m(row)(column)
      }).sliding(m(0).length, m(0).length).map(_.toArray).toArray
    }
  }
}
