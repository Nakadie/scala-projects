package codewars

object opposite_number {
  def main(args: Array[String]): Unit = {
    def opposite(number: Double): Double = {
      number * -1
    }
    print(opposite(-21.778))
  }

}
// best ==
// def opposite(number: Double): Double = -number
