object ListReversalUsingFold {

  def reverseLeft[T](xs: List[T]) = (List[T]() /: xs) {(ys, y) => y :: ys}

}
