import java.io.File

object ProducingNewCollWithYield extends App {
  val filesHere = (new File((".")).listFiles())

  def fileLines(file: java.io.File) =
    scala.io.Source.fromFile(file).getLines().toList

  def scalaFiles =
    for {
      file <- filesHere
      if file.getName.endsWith(".scala")
    } yield file


  val forLineLengths =
    for {
      file <- filesHere
      if file.getName.endsWith(".scala")
      line <- fileLines(file)
      trimmed = line.trim
      if trimmed.matches(".*for.*")
    } yield trimmed.length

  println("Array of line lenghts:     ")
  println(forLineLengths)
}