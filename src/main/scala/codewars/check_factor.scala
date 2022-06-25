package codewars

object check_factor {
  def main(args: Array[String]): Unit = {
    def checkForFactor(base: Int, factor: Int): Boolean = {
      if(base%factor == 0)
        true
      else
        false
    }
    println(checkForFactor(10, 2))
  }

}
