object ListOperations extends App {

  val abcde = List('a', 'b', 'c', 'd', 'e')
  println(abcde)
  println(abcde.last)
  println(abcde.init)
//  println(List().init)  // throws exception
//  println(List().last)  // throws exception

  // Reversing lists: reverse
  println(abcde.reverse)
  // Lists are immutable
  println(abcde)

  // Reverse implementation
  def rev[T](xs: List[T]): List[T] = xs match {
    case List() => xs
    case x :: xs1 => rev(xs1) ::: List(x)
  }

  // Prefixes and suffixes: drop, take, and splitAt
  println(abcde take 2)
  println(abcde drop 2)
  println(abcde splitAt 2)

  // Element selection: apply and indices
  println(abcde apply 2)
  println(abcde(2))
  // list the indices
  println(abcde.indices)

  // Flattening a list of lists: flatten
  println(List(List(1, 2), List(3), List(), List(4, 4)).flatten)

  //Zipping lists: zip and unzip
  println(abcde.indices zip abcde)
  println(abcde zip List(1, 2, 3))
  val zipped = abcde.zipWithIndex
  println(zipped)
  println(zipped.unzip)

  // Displaying lists: toString and mkString
  println(abcde.toString)
  println(abcde mkString ("[", ",", "]"))
  println(abcde mkString "")
  println(abcde mkString ("List(", ", ", ")"))
  //StringBuilder
  val buf = new StringBuilder
  println(abcde addString (buf, "(", ";", ")"))

  // Converting lists: iterator, toArray, copyToArray
  val arr = abcde.toArray
  println(arr)
  println(arr.toList)
  val arr2 = new Array[Int](10)
  List(1, 2, 3) copyToArray (arr2, 3)
  println(arr2)

}
