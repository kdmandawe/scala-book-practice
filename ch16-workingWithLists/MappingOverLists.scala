object MappingOverLists extends App {

  println(List(1, 2, 3) map (_ + 1))

  val words = List("the", "quick", "brown", "fox")

  println(words map (_.length))

  println(words map (_.toList.reverse.mkString))

  // map vs flatMap
  println(words map (_.toList))
  println(words flatMap (_.toList))

  println(List.range(1, 5) flatMap (i => List.range(1, i) map (j => (i, j))))

  // for expression
  val for1 = for (i <- List.range(1, 5); j <- List.range(1, i)) yield (i, j)

  val for2 =
    for {
      i <- List.range(1, 5)
      j <- List.range(1, i)
    } yield {
      (i, j)
    }

  println(for1)
  println(for2)

  // foreach
  var sum = 0
  List(1, 2, 3, 4, 5) foreach (sum += _)

  println(sum)
}
