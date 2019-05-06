import java.io.File

object ForExpression extends App {


  val filesHere = (new File(".")).listFiles

  for (file <- filesHere)
    println(file)

  for (i <- 1 to 4)
    println("Iteration " + i)

  for (i <- 1 until 4)
    println("Iteration " + i)

  // Not common in Scala ...
  for (i <- 0 to filesHere.length - 1)
    println(filesHere(i))
}