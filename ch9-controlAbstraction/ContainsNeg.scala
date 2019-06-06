object ContainsNeg {

//  def containsNeg(nums: List[Int]): Boolean = {
//    var exists = false
//    for (num <- nums)
//      if (num < 0)
//        exists = true
//    exists
//  }

  def containsNeg(nums: List[Int]): Boolean =
    nums.exists(_ < 0)

  def containsOdd(nums: List[Int]) =
    nums.exists(_ % 2 == 1)

}