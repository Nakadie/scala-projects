package codewars

object removing_elements_array {
  def main(args: Array[String]): Unit = {
    def removeEveryOther[T](list: List[T]) = {

      val answer = for(i<- list.indices by 2)
        yield list(i)
      answer.toList
    }
    println(removeEveryOther(List(1, 2, 3, 4, 5)))
  }// end of main

} // end of removing_elements_array
