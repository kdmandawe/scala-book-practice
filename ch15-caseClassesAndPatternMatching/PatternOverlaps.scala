import org.stairwaybook.expr.{BinOp, Expr, Number, UnOp}

object PatternOverlaps {

  def simplifyAll(expr: Expr): Expr = expr match {
    case UnOp("-", UnOp("-", e)) =>
      simplifyAll(e)  // '-' is it's own inverse
    case BinOp("+", e, Number(0)) =>
      simplifyAll(e)  // '0' is a neutral element for '+'
    case BinOp("*", e, Number(1)) =>
      simplifyAll(e)  // '1' is a neutral element for '*'
    case UnOp(op, e) =>
      UnOp(op, simplifyAll(e))
    case BinOp(op, l, r) =>
      BinOp(op, simplifyAll(l), simplifyAll(r))
    case _ => expr
  }
}
