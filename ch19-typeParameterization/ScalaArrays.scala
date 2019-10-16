object ScalaArrays extends App {

  val a1 = Array("abc")
  val a2: Array[Object] = a1.asInstanceOf[Array[Object]]

  println(a2)
}
