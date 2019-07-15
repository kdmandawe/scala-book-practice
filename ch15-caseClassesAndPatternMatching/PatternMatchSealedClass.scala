import org.stairwaybook.expr.{Expr, Number, Var}

object PatternMatchSealedClass {

  def describe(e: Expr): String = (e: @unchecked) match {
    case Number(_) => "a number"
    case Var(_) => "a variable"
  }
}
