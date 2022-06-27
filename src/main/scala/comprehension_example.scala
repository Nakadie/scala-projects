object comprehension_example {
  def main(args: Array[String]): Unit = {
    val mylist = List(1,2,3,4)
    val target = 4
    val add = 4
    println(mylist.map{num => if (num == target) num + add else num})

    def addXToSpecificValueInList(nums: List[Int], target: Int, add: Int): List[Int] = {
      nums.map{num => if (num == target){
        num + add
      }  else num}
    }

  }
}
