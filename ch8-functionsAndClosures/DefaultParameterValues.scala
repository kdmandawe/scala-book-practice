object DefaultParameterValues {

  def printTime(out: java.io.PrintStream = Console.out) =
    out.println("time = " + System.currentTimeMillis())

  def printTime2(out: java.io.PrintStream = Console.out, divisor: Int = 1) =
    out.println("time = " + System.currentTimeMillis()/divisor)
}