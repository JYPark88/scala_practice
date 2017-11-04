package LS4

/**
  * user : Nolan (박재영) 
  * email : jypark88@coupang.com
  * date : 2017. 10. 16.
  * time : PM 1:34
  */
object LS4_1 {

  def getRoundArea(radius: Double): Double = radius * Math.pow(Math.PI, 2)

  def main(args: Array[String]): Unit = {
    println(getRoundArea(2))
  }
}
