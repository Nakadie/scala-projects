package codewars

object twoToOne {
  def main(args: Array[String]): Unit = {
    def longest(s1: String, s2: String) = {
      var answer = s1 + s2
      val letters = answer.split("")
      letters.distinct.sorted.mkString("")




    }
    println(longest("aretheyhere", "yestheyarehere")) //"aehrsty"
  }


}
