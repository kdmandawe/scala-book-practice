object ListLiterals extends App {

//  val fruit: List[String] = List("apples", "oranges", "pears")
//  val nums: List[Int] = List(1, 2, 3, 4)
//  val diag3: List[List[Int]] =
//  List(
//    List(1, 0, 0),
//    List(0, 1, 0),
//    List(0, 0, 1)
//  )

//  val empty: List[Nothing] = List()

  // List() is also of type List[String]!
  val xs: List[String] = List()

  // Constructing Lists
  val fruit = "apples" :: ("oranges" :: ("pears" :: Nil))
//  val nums = 1 :: (2 :: (3 :: (4 :: Nil)))
  val diag3 = (1 :: (0 :: (0 :: Nil))) ::
    (0 :: (1 :: (0 :: Nil))) ::
    (0 :: (0 :: (1 :: Nil))) :: Nil

  val empty = Nil

  // right associativity
  val nums = 1 :: 2 :: 3 :: 4 :: Nil

//  println(Nil.head)

//  def isort(xs: List[Int]): List[Int] =
//    if (xs.isEmpty) Nil
//    else insert(xs.head, isort(xs.tail))
//
//  def insert(x: Int, xs: List[Int]): List[Int] =
//    if (xs.isEmpty || x <= xs.head) x :: xs
//    else xs.head :: insert(x, xs.tail)

//  val List(a, b, c) = fruit

//  println(a)

  val a :: b :: rest = fruit
  println(a, b, rest)

  def isort(xs: List[Int]): List[Int] = xs match {
    case List()   => List()
    case x :: xs1 => insert(x, isort(xs1))
  }

  def insert(x: Int, xs: List[Int]): List[Int] = xs match {
    case List() => List(x)
    case y :: ys =>
      if (x <= y) x :: ys
      else y :: insert(x, ys)
  }
}
