object FilteringLists extends App {

  // filter
  println(List(1, 2, 3, 4, 5) filter (_ % 2 == 0))

  val words = List("the", "quick", "brown", "fox")
  println(words.filter (_.length == 3))

  // partition
  println(List(1, 2, 3, 4, 5) partition (_ % 2 == 0))

  // find
  println(List(1, 2, 3, 4, 5) find (_ % 2 == 0))
  println(List(1, 2, 3, 4, 5) find (_ <= 0))

  // takeWhile/dropWhile
  println(List(1, 2, 3, -4, 5) takeWhile (_ > 0))
  println(words dropWhile (_ startsWith "t"))

  // span (takeWhile and dropWhile in one operation)
  println(List(1, 2, 3, -4, 5) span (_ > 0))

}
