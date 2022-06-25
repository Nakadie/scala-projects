package codewars

object helpTheBookseller {
  def main(args: Array[String]): Unit = {
    def stockSummary(lstOfArt: Array[String], lstOfCat: Array[String]) = {
      val values = for(i <- lstOfCat.toList) yield{
        var count = 0
        for(j <- lstOfArt.toList){
          if(j.startsWith(i) == true){
            val numbers = j.split(" ")
            count += numbers(1).toInt
          }
        }
        List(i, count)
      }
      val answer = s"(${values(0)(0)} : ${values(0)(1)}) - (${values(1)(0)} : ${values(1)(1)}) - (${values(2)(0)} : ${values(2)(1)}) - (${values(3)(0)} : ${values(3)(1)})"
      answer
    }
    var b = Array("BBAR 150", "CDXE 515", "BKWR 250", "BTSQ 890", "DRTY 600")
    var c = Array("A", "B", "C", "D")
    println(stockSummary(b, c))
    //answer (A : 0) - (B : 1290) - (C : 515) - (D : 600)
  }
}
