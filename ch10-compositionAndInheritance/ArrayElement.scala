class ArrayElement extends Element {
  override def demo(): Unit = {
    println("ArrayElement's implementation invoked")
  }
}

class Cat {
  val dangerous = false
}

class Tiger (
  override val dangerous: Boolean,
  private var age: Int
  ) extends Cat