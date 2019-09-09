object SortWith extends App {

  println(List(1, -3, 4, 2, 6) sortWith (_ < _))

  val words = List("the", "quick", "brown", "fox")
  println(words sortWith (_.length > _.length))
}
