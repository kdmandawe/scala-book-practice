import java.io.File

object ForExpressionFiltering extends App {

  val filesHere = (new File((".")).listFiles())

  println("Inside for parens")
  for (file <- filesHere if file.getName.endsWith(".scala"))
    println(file)

  println()
  println("Imperative style")
  for (file <- filesHere)
    if (!file.getName.endsWith(".scala"))
      println(file)

  println()
  println("More filters")
  for (
    file <- filesHere
    if file.isFile
    if file.getName.endsWith(".scala")
  ) println(file)

}