class ArrayElement(val contents: Array[String]) extends Element

class Cat {
  val dangerous = false
}

class Tiger (
  override val dangerous: Boolean,
  private var age: Int
  ) extends Cat