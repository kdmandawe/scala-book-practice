object SimplifyTop {

  def simplifyTop(expr: Expr): Expr = expr match {
    case UnOp("-", UnOp("-", e))         => e // Double negation
    case BinOp("+", e, MyNumber(0))      => e // Adding zero
    case BinOp("*", e, MyNumber(1))      => e // Multiplying by one
    case UnOp("abs", e @ UnOp("abs", _)) => e // variable binding
    case _                               => expr
  }

  def wildCardPatterns(expr: Expr) = expr match {
//    case BinOp(op, left, right) =>
//      println(expr + " is a binary operation")
//    case _ => // handle the default case

    case BinOp(_, _, _) =>
      println(expr + " is a binary operation")
    case _ => println("It's something else")
  }

  def describe(x: Any) = x match {
    case 5       => "five"
    case true    => "truth"
    case "hello" => "hi!"
    case Nil     => "the empty list"
    case _       => "something else"
  }

  def variablePattern(x: Any) = x match {
    case 0             => "zero"
    case somethingElse => "not zero: " + somethingElse
  }

  def constructorPattern(expr: Expr) = expr match {
    case BinOp("+", e, MyNumber(0)) => println("a deep match")
    case _                          =>
  }

  def sequencePattern(x: Any) = x match {
    case List(0, _, _) => println("List of size 3")
    case List(0, _*)   => println("List of any size")
    case _             =>
  }

  def tupleDemo(expr: Any) =
    expr match {
      case (a, b, c) => println("matched " + a + b + c)
      case _         =>
    }

  def generalSize(x: Any) = x match {
    case s: String    => s.length
    case m: Map[_, _] => m.size
    case _            => -1
  }

  def isIntIntMap(x: Any) = x match {
    case m: Map[Int, Int] => true // type erasure!!!
    case _                => false
  }

  def isStringArray(x: Any) = x match {
    case a: Array[String] => "yes"
    case _                => "no"
  }

}
