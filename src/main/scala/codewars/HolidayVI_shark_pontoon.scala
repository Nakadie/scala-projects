package codewars

object HolidayVI_shark_pontoon {
  def main(args: Array[String]): Unit = {
    def shark(
               pontoon_distance: Float,
               shark_distance: Float,
               you_speed: Float,
               shark_speed: Float,
               dolphin: Boolean
             ): String = {
      val sharkTime = if (dolphin){
        val new_speed = shark_speed / 2
        shark_distance / new_speed
      } else{shark_distance / shark_speed}


      val myTime = pontoon_distance / you_speed
      println(sharkTime)
      if (myTime > sharkTime)
        "Shark Bait!"
      else
        "Alive!"
    }
    println(shark(24, 2, 4, 8, dolphin = true))
  }

}
