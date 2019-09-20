object Arrays extends App {

  val fiveInts = new Array[Int](5)
  println(fiveInts)

  val fiveToOne = Array(5, 4, 3, 2, 1)
  println(fiveToOne)

  fiveInts(0) = fiveToOne(4)
  println(fiveInts(0))

}
