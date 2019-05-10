import java.io.{BufferedReader, InputStreamReader}

object LivingWithoutBreakAndContinue extends App {

  var i = 0
  var foundIt = false

  while (i < args.length && !foundIt) {
    if (!args(i).startsWith("-")) {
      if (args(i).endsWith(".scala"))
        foundIt = true
    }
    i = i + 1
  }


  // improved - recursion

  def searchFrom(idx: Int): Int =
    if(idx >= args.length) -1
    else if (args(idx).startsWith("-")) searchFrom(idx + 1)
    else if (args(idx).endsWith(".scala")) i
    else searchFrom(idx + 1)

  val returnI = searchFrom(0)
  println(returnI)


  // not recommended but avail when really necessary

  import scala.util.control.Breaks._
  import java .io

  val in = new BufferedReader(new InputStreamReader(System.in))

  breakable {
    while (true) {
      println("? ")
      if (in.readLine() == "") break
    }
  }
}