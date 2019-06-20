trait Philosophical {
  def philosophize() = {
    println("I consume memory, therefore I am!")
  }
}

//class Frog extends Philosophical {
//  override def toString: String = "green"
//}

class Animal
trait HasLegs

class Frog extends Animal with Philosophical with HasLegs {
  override def toString: String = "green"

  override def philosophize(): Unit = {
    println("It ain't easy being " + toString + "!")
  }
}
