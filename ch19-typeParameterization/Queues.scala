class SlowAppendQueue[T](elems: List[T]) { // Not efficient - enqueue is O(n) not O(1)
  def head = elems.head
  def tail = new SlowAppendQueue(elems.tail)
  def enqueue(x: T) = new SlowAppendQueue(elems ::: List(x))
}

class SlowHeadQueue[T](smele: List[T]) { // Not efficient - enqueue is already O(1) but head and tail are O(n)
  // smele is elems reversed
  def head = smele.last
  def tail = new SlowHeadQueue(smele.init)
  def enqueue(x: T) = new SlowHeadQueue(x :: smele)

}

//trait Queue[+T] {
//  def head: T
//  def tail: Queue[T]
//  def enqueue[U >: T](x: U): Queue[U]
//}
//
//object Queue {
//  // constructs a queue with initial elements `xs`
//  def apply[T](xs: T*): Queue[T] = new QueueImpl[T](xs.toList, Nil)
//
//  // Information hiding
//  private class QueueImpl[T] (
//                               private val leading: List[T],
//                               private val trailing: List[T]
//                             ) extends Queue[T] {
//    private def mirror =
//      if (leading.isEmpty)
//        new QueueImpl(trailing.reverse, Nil)
//      else
//        this
//    def head = mirror.leading.head
//    def tail = {
//      val q = mirror
//      new QueueImpl(q.leading.tail, q.trailing)
//    }
//    def enqueue[U >: T](x: U) =
//      new QueueImpl(leading, x :: trailing)
//  }
//}

class Fruit
class Apple extends Fruit
class Orange extends Fruit

//object Main extends App {
//  val queue = Queue("")
//  val new1 = queue.enqueue("hello")
//  println(new1.head)
//  println(new1.tail)
//  val new2 = new1.enqueue("world")
//  println(new2.head)
//
//  def doesCompile(q: Queue[AnyRef]) = {
//    println("success")
//  }
//
//  // covariance
//  doesCompile(Queue(""))
//
//  // Covariance and Lower Bounds
//  val queue2 = Queue(new Fruit)
//  queue2.enqueue(new Orange)
//
//}
