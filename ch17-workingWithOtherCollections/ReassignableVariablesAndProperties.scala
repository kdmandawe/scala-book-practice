object ReassignableVariablesAndProperties extends App {

  val t = new Thermometer
  println(t)
  println(t.celsius)
  t.celsius = 100
  println(t)
  t.fahrenheit = -40
  println(t)
}

class Time {
  var hour = 12
  var minute = 0
}

class Time2 {
  private[this] var h = 12
  private[this] var m = 0

  def hour: Int = h
  def hour_=(x: Int) = {h = x}

  def minute: Int = h
  def minute_=(x: Int) = {m = x}
}

class Time3 {
  private[this] var h = 12
  private[this] var m = 0

  def hour: Int = h
  def hour_= (x: Int) = {
    require(0 <= x && x < 24)
    h = x
  }

  def minute = m
  def minute_= (x: Int) = {
    require(0 <= x && x < 60)
    m = x
  }
}

class Thermometer {
  var celsius: Float = _

  def fahrenheit = celsius * 9 / 5 + 32
  def fahrenheit_= (f: Float) = {
    celsius = (f - 32) * 5 / 9
  }

  override def toString: String = fahrenheit + "F/" + celsius + "C"
}


