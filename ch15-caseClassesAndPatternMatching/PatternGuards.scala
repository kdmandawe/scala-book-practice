import org.stairwaybook.expr.{BinOp, Expr, Number}

object PatternGuards {

//  def simplifyAdd(e: Expr) = e match {
//    case BinOp("+", x, x) => BinOp("*", x, Number(2)) // Won't compile!
//    case _ => e
//  }

  def simplifyAdd(e: Expr) = e match {
    case BinOp("+", x, y) if x == y => BinOp("*", x, Number(2))
    case _ => e
  }
}
