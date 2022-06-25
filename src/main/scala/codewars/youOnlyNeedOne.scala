package codewars

object youOnlyNeedOne {
  def main(args: Array[String]): Unit = {
    def check(seq: List[Any], elem: Any) = {
      seq.contains(elem)
    }
    println(check(List(1,2,3,4), 4))
  }
}
