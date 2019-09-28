object MutableVsImmutable extends App {

  var people = Set("Nancy", "Jane")
  println(people)

  people += "Bob" // people should be var to make this possible

  println(people)

}
