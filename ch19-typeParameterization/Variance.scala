object Variance extends App {
  val c1 = new Cell[String]("abc")
  val c2: Cell[Any] = c1
//  c2.set(1)
  val s: String = c1.get


  // Nonvariant(rigid) Arrays
  val a1 = Array("abc")
  // val a2: Array[Any] = a1

  // emulating generic array
  val a2: Array[Object] = a1.asInstanceOf[Array[Object]]

//  val x: Queue[Any] = new StrangeIntQueue
//  x.enqueue("abc")
}

class Cell[+T](init: T) {
  private[this] var current = init
  def get = current
  // Contravariant position
  // def set(x: T) = {current = x}
}

//class StrangeIntQueue extends Queue[Int] {
//  override def head: Int = ???
//
//  override def tail: Queue[Int] = ???
//
//  // Covariant version
//  override def enqueue[U >: Int](x: U): Queue[U] = ???

//  override def enqueue(x: Int): Queue[Int] = {
//    println(math.sqrt(x))
//    super.enqueue(x)
//  }
//}

trait OutputChannel[-T] {
  def write(x: T)
}




