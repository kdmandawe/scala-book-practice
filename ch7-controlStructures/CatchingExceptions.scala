import java.io.{FileNotFoundException, FileReader}
import java.net.{MalformedURLException, URL}

object CatchingExceptions extends App {

  val f = new FileReader("input.txt")
  try {

    // Use the file

  } catch {
    case ex: FileNotFoundException  => // Handle missing file
    case ex: IOException => / Handle other I/O
  } finally {
    f.close()
  }

  def urlFor(path: String) =
    try {
      new URL(path)
    } catch {
      case e: MalformedURLException =>
        new URL("http://www.scala-lang.org")
    }
}