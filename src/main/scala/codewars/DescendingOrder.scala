package codewars

object DescendingOrder {
  def main(args: Array[String]): Unit = {
    def descendingOrder(num: Int) = {
      val digits = num.toString.toList
      var answer = digits.sorted.reverse
      answer.mkString("").toInt

    }
    println(descendingOrder(123456789))
  }

}
