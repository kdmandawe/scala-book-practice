object PatternMatchSealedClass {

  def describe(e: Expr): String = (e: @unchecked) match {
    case MyNumber(_) => "a number"
    case Var(_) => "a variable"
  }
}
