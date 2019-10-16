class LowerBounds {

}

class Queue1[+T] (private val leading: List[T], private val trailing: List[T]) {
  def enqueue[U >: T](x: U) = new Queue1[U](leading, x :: trailing)
}


