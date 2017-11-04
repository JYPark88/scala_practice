package LS4

/**
  * user : Nolan (박재영) 
  * email : jypark88@coupang.com
  * date : 2017. 10. 16.
  * time : PM 2:22
  */
object LS4_6 {

  def vectorLength(a: (Int, Int), b: (Int, Int)): Double = {
    Math.sqrt(Math.pow(a._1 - b._1, 2) + Math.pow(a._2 - b._2, 2))
  }

  def main(args: Array[String]): Unit = {
    println(vectorLength((1, 2), (2, 3)))
  }
}
