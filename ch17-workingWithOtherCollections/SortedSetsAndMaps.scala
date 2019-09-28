import scala.collection.immutable.{TreeMap, TreeSet}

object SortedSetsAndMaps extends App {

  val ts = TreeSet(9, 3, 1, 8, 0, 2, 7, 4, 6, 5)
  println(ts)

  val cs = TreeSet('f', 'u', 'n')
  println(cs)

  var tm = TreeMap(3 -> 'x', 1 -> 'x', 4 -> 'x')
  println(tm)

  tm += (2 -> 'x')
  println(tm)
}
