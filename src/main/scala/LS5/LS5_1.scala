package LS5

/**
  * user : Nolan (박재영) 
  * email : jypark88@coupang.com
  * date : 2017. 11. 4.
  * time : PM 9:49
  */
object LS5_1 {

  val findMax = (a: Int, b: Int) => if (a > b) a else b

  def findMaxOnThree(tuple: (Int, Int, Int), f: (Int, Int) => Int): Int = f(f(tuple._1 , tuple._2), tuple._3)

  def main(args: Array[String]): Unit = {
    println(findMaxOnThree((1, 2, 3), findMax))
  }
}
