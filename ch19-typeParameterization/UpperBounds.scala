
class Person(val firstName: String, val lastName: String) extends Ordered[Person] {

  def compare(that: Person) = {
    val lastNameComparison = lastName.compareToIgnoreCase(that.lastName)
    if (lastNameComparison != 0) {
      lastNameComparison
    } else {
      firstName.compareToIgnoreCase(that.firstName)
    }
  }

  override def toString = firstName + " " + lastName
}

object UpperBounds extends App {

  val robert = new Person("Robert", "Jones")
  val sally = new Person("Sally", "Smith")
  println(robert < sally)

}
