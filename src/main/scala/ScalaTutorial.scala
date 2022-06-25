import scala.io.StdIn.{readLine, readInt}
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source
//noinspection SpellCheckingInspection
object ScalaTutorial {
  //noinspection SpellCheckingInspection
  def main(args: Array[String]): Unit ={

    var i = 0
    //noinspection SpellCheckingInspection
    /*
        while(i <= 10){
          println(i)
          i += 1

        var i = 0
        do {
          println(i)
          i += 1
        }while (i <= 20)

        for ( i <- 1 to 10)
          println(i)


        val randLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
        for(i <- 0 until randLetters.length)
          println(randLetters(i))


        val aList = List(1,2,3,4,5)
        for(i <- aList){
          println("list items " + i)

        var evenList = for {i <- 1 to 20
                            if (i % 2) == 0
                            } yield i
        for(i <- evenList)
          println(i)

        for (i <- 1 to 5; j <- 6 to 10){
          println("i : " + i)
          println("j :" + j)
        }


        def printPrimes(): Unit ={
          val primeList = List(1,2,3,4,5,7,11)
          for(i <- primeList){
            if(i == 11){
              return
            }
            if(i != 1){
              println(i)
            }
          }
        }
        printPrimes


        var numberGuess = 0

        do{
          print("guess a number ")
          numberGuess = readLine.toInt

        }while(numberGuess != 15)

        printf("you guessed the secret number  %d\n", 15)

        val name = "derek"
        val age = 40
        val weight = 175.5

        println(s"hello $name")
        println(f"I am ${age + 1} and weigh $weight%.2f")

    var randSent = "I saw a drogon fly by"
    val randSentArray = randSent.toArray
    for(v <- randSentArray)
      println(v)
    println(randSent.concat("buuf"))


    def getSum(num1 : Int = 1, num2 : Int = 1) : Int ={
      return num1 + num2
    }
    println(getSum(num2 =5,num1 =4))

    // use unit when not returning anything.
    def sayHi() : Unit = {
      println("hi how are you")
    }
    sayHi()


    def getSum(args : Int*) : Int = {
      var sum : Int = 0
      for(num <- args){
        sum += num
      }
      return sum
    }
    println(getSum(1,2,2,4,5,6))


    def factorial(num : BigInt) : BigInt = {
      if(num <= 1)
        return 1
      else
        return num * factorial(num - 1)
    }
    println(factorial(4))


    val favNums = new Array[Int](20)

    val friends = Array("bob", "tom")

    friends(0) = "sue"

    println(friends(0))

    val friends2 = ArrayBuffer[String]()

    friends2.insert(0, "phil")

    friends2 += "mark"

    friends2 ++= Array("susy", "paul")

    friends2.insert(1, "mike")

    friends2.remove(1,2)

    var friend : String = " "

    for(friend <- friends2)
      println(friend)

    for(j <- 0 to (favNums.length - 1)) {
      favNums(j) = j
      println(favNums(j))
    }
    */


    }// end of main
  } // end of scala tutorial

