package codewars

object playing_with_digits extends App {
  //my solution
  def digPow(n: Int, p: Int): Int = {
    def power(x: Int, n: Int): Int = {
      if (n == 0) 1
      else x * power(x, n - 1)
    }
    val lstn = n.toString.toList
    val exp = LazyList.from(p, 1)
    val nAndExp = lstn.zip(exp)
    val products = nAndExp.map {
      case (n, e) => power(n.asDigit, e)
    }
    val sum = products.sum
    val check = sum / n
    if (sum == check * n) check else -1

    /*def digPow(n: Int, p: Int): Int = {
    friends solution.
    val ds = n.toString.toList
    val exps = LazyList.from(p, 1)
    val products = ds.lazyZip(exps).map((d, exp)  => scala.math.pow(d.asDigit, exp))
    val sum = products.sum
    val check = sum/n
    if (check * n == sum) check.toInt else -1
  }*/



  }
  println(digPow(46288, 3))
}


//dig_pow(695, 2) should return 2 since 6² + 9³ + 5⁴= 1390 = 695 * 2
/*
dig_pow(89, 1) should return 1 since 8¹ + 9² = 89 = 89 * 1
dig_pow(92, 1) should return -1 since there is no k such as 9¹ + 2² equals 92 * k

dig_pow(46288, 3) should return 51 since 4³ + 6⁴+ 2⁵ + 8⁶ + 8⁷ = 2360688 = 46288 * 51
 */
