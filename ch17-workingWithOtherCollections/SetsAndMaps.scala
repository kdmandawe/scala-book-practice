import scala.collection.mutable

object SetsAndMaps extends App {

  val mutaSet = mutable.Set(1, 2, 3)
  println(mutaSet)

  // Using sets

  val text = "See Spot run. Run, Spot. Run!"
  println(text)

  val wordsArray = text.split("[ !,.]+")
  println(wordsArray.mkString(","))

  val words = mutable.Set.empty[String]
  println(words)

  for (word <- wordsArray)
    words += word.toLowerCase

  println(words)

  // Common operations for sets

  val nums = Set(1, 2, 3)
  nums + 5
  println(nums)
  println(nums - 3)
  nums ++ List(5, 6)
  println(nums)
  println(nums -- List(1, 2))
  // takes intersection of two sets
  println(nums & Set(1,3,5,7))
  println(nums.size)
  println(nums.contains(3))
  words += "the"
  println(words)
  words -= "the"
  println(words)
  words ++= List("do", "re", "mi")
  println(words)
  words --= List("do", "re")
  println(words)
  words.clear
  println(words)

  // Using Maps
  val map = mutable.Map.empty[String, Int]
  println(map)
  map("hello") = 1
  map("there") = 2
  println(map)
  println(map("hello"))

  def countWords(text: String) = {
    val counts = mutable.Map.empty[String, Int]
    for (rawWord <- text.split("[ ,!.]+")) {
      val word = rawWord.toLowerCase
      val oldCount =
        if (counts.contains(word)) counts(word)
        else 0
      counts += (word -> (oldCount + 1))
    }
    counts
  }

  println(countWords("See Spot run! Run, Spot. Run!"))

  val nums2 = Map("i" -> 1, "ii" -> 2)
  println(nums2)

  nums2 + ("vi" -> 6)
  println(nums2)
  println(nums2 - "ii")
  println(nums2 ++ List("iii" -> 3, "v" -> 5))
  println(nums2 -- List("i", "ii"))
  println(nums2.size)
  println(nums2.contains("ii"))
  println(nums2("ii"))
  println(nums2.keys)
  println(nums2.keySet)
  println(nums2.values)
  println(nums2.isEmpty)

}
