import java.io.PrintWriter

object ControlStructures {

  def twice(op: Double => Double, x: Double) = op(op(x))

//  def withPrintWriter(file: java.io.File, op: PrintWriter => Unit) = {
//    val writer = new PrintWriter(file)
//    try {
//      op(writer)
//    } finally {
//      writer.close()
//    }
//  }

  def withPrintWriter(file: java.io.File)(op: PrintWriter => Unit) = {
    val writer = new PrintWriter(file)
    try {
      op(writer)
    } finally {
      writer.close()
    }
  }
}