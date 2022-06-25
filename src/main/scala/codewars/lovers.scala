package codewars

object lovers {
  def main(args: Array[String]): Unit ={
    def lovefunc(flower1: Int, flower2: Int): Boolean = {
      if((flower1 + flower2)%2 == 1)
        true
      else
        false
    }
    println(lovefunc(2, 1))
  }


  }

