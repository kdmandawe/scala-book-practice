import scala.collection.mutable.ArrayBuffer

object ArrayBuffers extends App {

  val buf = new ArrayBuffer[Int]
  buf += 12
  println(buf)

  buf += 15
  println(buf)

  println(buf.length)
  println(buf(0))

}
