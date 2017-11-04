package LS4

import LS4.LS4_1.getRoundArea

/**
  * user : Nolan (박재영) 
  * email : jypark88@coupang.com
  * date : 2017. 10. 16.
  * time : PM 1:40
  */
object LS4_2 {

  def getRoundArea(radius: String): Double = {
    radius.toDouble * Math.pow(Math.PI, 2)
  }

  def main(args: Array[String]): Unit = {
    println(getRoundArea(""))
  }
}
