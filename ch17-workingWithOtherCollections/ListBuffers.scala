import scala.collection.mutable.ListBuffer

object ListBuffers extends App {

  val buf = new ListBuffer[Int]
  buf += 1
  println(buf)

  buf += 2
  println(buf)

  3 +=: buf
  println(buf)

  println(buf.toList)

}
