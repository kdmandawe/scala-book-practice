class Point(val x: Int, val y: Int)

class Rectangle(val topLeft: Point, val bottomRight: Point) extends Rectanglular {
  // and many more geometric methods...
}

//abstract class Component {
//  def topLeft: Point
//  def bottomRight: Point
//
//  def left = topLeft.x
//  def right = bottomRight.x
//  def width = right - left
//  // and many more geometric methods...
//}

trait Rectanglular {
  def topLeft: Point
  def bottomRight: Point

  def left = topLeft.x
  def right = bottomRight.x
  def width = right - left
  // and many more geometric methods...
}

abstract class Component extends Rectanglular {
  // other methods...
}



