package codewars

object Pillars {
  def main(args: Array[String]): Unit = {
    def distance(num_pill: Int, dist: Int, width: Int): Int = {
      val answer = if (num_pill == 1) {
        0
      } else if (num_pill == 2) {
        dist * 100
      } else {
        ((num_pill - 1) * (dist * 100)) + (num_pill * width) - (width * 2)
      }
      answer
    }
    println(distance(1, 111, 25)) // 0
    println(distance(2,20,25)) // 2000
    println(distance(11, 15, 30)) // 15270
  }
}
