object FoldingLists extends App {

  def sum(xs: List[Int]): Int = (0 /: xs) (_ + _)
  println(sum(List(1, 2, 3, 4)))


  def product(xs: List[Int]): Int = (1 /: xs) (_ * _)
  println(product(List(1, 2, 3, 4)))
  // concatenate all words
  val words = List("the", "quick", "brown", "fox")
  println(("" /: words) (_ + " " + _))
  // remove beginning space
  println((words.head /: words.tail) (_ + " " + _))

  def flattenLeft[T](xss: List[List[T]]) =
    (List[T]() /: xss) (_ ::: _)

  def flattenRight[T](xss: List[List[T]]) =
    (xss :\ List[T]()) (_ ::: _)
}
