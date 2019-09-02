object DivideAndConquerPrinciple extends App {

  def append[T](xs: List[T], ys: List[T]): List[T] = {
    xs match {
      case List() => ys
      case x :: xs1 => x :: append(xs1, ys)
    }
  }

  println(append(List(1, 2), List(3, 4)))
}
