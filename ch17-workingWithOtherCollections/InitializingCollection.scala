import scala.collection.immutable.TreeSet

object InitializingCollection extends App {

  val list1 = List(1, 2, 3)
  println(list1)

  val set1 = Set('a', 'b', 'c')
  println(set1)

  import scala.collection.mutable
  val muMap1 = mutable.Map("hi" -> 2, "there" -> 5)
  println(muMap1)

  val arr1 = Array(1.0, 2.0, 3.0)
  println(arr1)

  val stuff = mutable.Set[Any](42) // without element type this will be Set[Int]
  stuff += "abracadabra"

  val colors = List("blue", "yellow", "red", "green")
  println(colors)

//  val treeSet1 = TreeSet(colors)
//  println(treeSet1) // this will produce error

  val treeSet2 = TreeSet[String]() ++ colors
  println(treeSet2)

  // converting to array or list
  println(treeSet2.toList)
  println(treeSet2.toArray)

}
