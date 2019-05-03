class Rational(n: Int, d: Int) {

  require(d != 0, "zero not allowed as denominator")

  val numer: Int = n
  val denom: Int = d

  def this(n: Int) = this(n, 1) // auxillary constructor

  override def toString: String = numer + "/" + denom

  def add(that: Rational): Rational =
    new Rational(
      numer * that.denom + that.numer * denom,
      denom * that.denom
    )

  def lessThan(that: Rational) =
    this.numer * that.denom < that.numer * this.denom

  def max(that: Rational) =
    if (this.lessThan(that)) that else this
}
