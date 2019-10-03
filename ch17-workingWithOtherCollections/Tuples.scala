object Tuples extends App {

  def longestWord(words: Array[String]) = {
    var word = words(0)
    var idx = 0
    for (i <- 1 until words.length)
      if (words(i).length > word.length) {
        word = words(i)
        idx = i
      }
    (word, idx)
  }

  val longest = longestWord("The quick brown fox".split(" "))
  println(longest)
  println(longest._1)
  println(longest._2)

  val (word, idx) = longest
  println(word)
  println(idx)

  val word2,idx2 = longest
  println(word2)
  println(idx2)
}
