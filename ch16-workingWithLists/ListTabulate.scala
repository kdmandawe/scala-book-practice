object ListTabulate extends App {

  val squares = List.tabulate(5)(n => n * n)
  println(squares)

  val multiplication = List.tabulate(5, 4)(_ * _)
  println(multiplication)
}
