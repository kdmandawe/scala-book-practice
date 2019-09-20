object StringOps extends App {

  def hasUpperCase(s: String) = s.exists(_.isUpper)

  println(hasUpperCase("Robert Frost"))

  println(hasUpperCase("e e cummings"))
}
