object PredicatesOverLists extends App {

  def hasZeroRow(m: List[List[Int]]) =
    m exists (row => row forall (_ == 0))

  println(hasZeroRow(List(List(1), List(1), List(1), List())))
}

