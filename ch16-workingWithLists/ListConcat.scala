object ListConcat extends App {

  println(List.concat(List('a', 'b'), List('c')))
  println(List.concat(List(), List('b'), List('c')))
  println(List.concat())

}
