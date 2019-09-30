object MutableVsImmutable extends App {

  var people = Set("Nancy", "Jane")
  println(people)

  people += "Bob" // people should be var to make this possible

  println(people)

  people -= "Jane"
  println(people)

  people ++= List("Tom", "Harry")
  println(people)

  import scala.collection.mutable.Map  // will make Map mutable
  var capital = Map("US" -> "Washington", "France" -> "Paris")
  capital += ("Japan" -> "Tokyo")
  println(capital("France"))


}
