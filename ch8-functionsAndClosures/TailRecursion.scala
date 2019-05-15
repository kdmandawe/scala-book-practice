object TailRecursion {

  // general structure

//  def approximate(guess: Double): Double =
//    if (isGoodEnough(guess)) guess
//    else approximate(improve(guess))


  def boom(x: Int): Int =
    if (x == 0) throw new Exception("boom!")
    else boom(x - 1) + 1

  def bang(x: Int): Int =
    if(x == 0) throw new Exception("bang!")
    else bang(x - 1)

}