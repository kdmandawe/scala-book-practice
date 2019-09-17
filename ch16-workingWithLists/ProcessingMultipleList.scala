object ProcessingMultipleList extends App {

  println((List(10, 20), List(3, 4, 5)).zipped.map(_ * _))

  // analogs to exists and forall
  println((List("abc", "de"), List(3, 2)).zipped.forall(_.length == _))
  println((List("abc", "de"), List(3, 2)).zipped.exists(_.length != _))

}