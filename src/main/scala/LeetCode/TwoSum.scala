package LeetCode

/*object TwoSum extends App{
  def twoSum(nums: Array[Int], target: Int) = {
    val answer = nums.filter(x => nums contains (target - x))
    val answer2 = answer.filter(x => (target-x != x) && answer.count(_ == x) == 1)
    val k = Array[Int](nums.indexOf(answer2(0)), nums.indexOf(answer2(1)))
    k*/
/*
object TwoSum extends App{
  def twoSum(nums: Array[Int], target: Int) = {
    val numsAndIndices = nums.zipWithIndex

    def findOtherPair(v1: Int, idx1: Int): Option[(Int, Int)] = numsAndIndices.find {
      case (v2, idx2) => v1 + v2 == target && idx1 != idx2
    }
    val Some((v1, idx1)) = numsAndIndices.find {
      case (v1, idx1) => findOtherPair(v1, idx1).nonEmpty == true
    }
    val Some((v2, idx2)) = findOtherPair(v1, idx1)
    List(idx1, idx2)
  }
  //println(twoSum(Array(3, 2, 4), 6).mkString("[", ",", "]"))   // ans == [1, 2]
  //println(twoSum(Array(3, 3), 6).mkString("[", ",", "]")) // ans == [0, 1]
*/

object TwoSum extends App{
  def twoSum(nums: Array[Int], target: Int): Array[Int] = {
    val numsAndIndices = nums.zipWithIndex

    def findOtherPair(v1: Int, idx1: Int): Option[(Int, Int)] = numsAndIndices.find {
      case (v2, idx2) => v1 + v2 == target && idx1 != idx2
    }

    val (idx1, idx2) = numsAndIndices.flatMap {
      case (v1, idx1) => findOtherPair(v1, idx1).map {
        case (_, idx2) => (idx1, idx2)
      }
    }.head

    Array(idx1, idx2)
  }
  println(twoSum(Array(2, 7, 11, 15), 9).mkString("[",",","]"))
  println(twoSum(Array(3, 2, 4), 6).mkString("[", ",", "]"))   // ans == [1, 2]
  println(twoSum(Array(3, 3), 6).mkString("[", ",", "]")) // ans == [0, 1]
}
object TwoSum extends App{
  def twoSums(nums: Array[Int], target: Int): Array[Int] = {
    val numsAndIndices = nums.toList.zipWithIndex

    val results = for {
    (v1, idx1) <- numsAndIndices.view
    (v2, idx2) <- numsAndIndices
    if v1 + v2 == target && idx1 != idx2
    } yield (idx1, idx2)

    val (idx1, idx2) = results.head

    (idx1, idx2)
    }}