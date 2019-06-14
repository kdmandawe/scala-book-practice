object CustomValue extends App {

  class Dollars(val amount: Int) extends AnyVal {
    override def toString: String = "$" + amount
  }

//  val money = new Dollars(1000000)
//  println(money)
//  println(money.amount)

  class SwissFrancs(val amount: Int) extends AnyVal {
    override def toString: String = amount + " CHF"
  }

  val dollars = new Dollars(1000)
  println(dollars)
  val francs = new SwissFrancs(1000)
  println(francs)
}
