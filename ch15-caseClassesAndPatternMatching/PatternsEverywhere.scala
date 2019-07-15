import org.stairwaybook.expr.{BinOp, Number}

object PatternsEverywhere extends App {

  val myTuple = (123, "abc")
  val (number, string) = myTuple

  println(number)
  println(string)

  val exp = new BinOp("*", Number(5), Number(1))
  val BinOp(op, left, right) = exp

  println(op)
  println(left)
  println(right)

  // Case sequences as partial functions

  val withDefault: Option[Int] => Int = {
    case Some(x) => x
    case None => 0
  }

  println(withDefault(Some(10)))
  println(withDefault(None))

  val second: List[Int] => Int = {
    case x :: y :: _ => y
  }

  println(second(List(5, 6, 7)))
//  println(second(List()))   // throw exception!!!

  val secondFP: PartialFunction[List[Int], Int] = {
    case x :: y :: _ => y
  }

  println(secondFP.isDefinedAt(List(5, 6, 7)))
  println(secondFP.isDefinedAt(List()))

  // Patterns in for expressions

  val capitals = Map("France" -> "Paris", "Japan" -> "Tokyo")

  for ((country, city) <- capitals)
    println("The capital of " + country + " is " + city)

  val results = List(Some("apple"), None, Some("orange"))

  for (Some(fruit) <- results) println(fruit)
}
