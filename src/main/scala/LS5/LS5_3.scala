package LS5

/**
  * user : Nolan (박재영) 
  * email : jypark88@coupang.com
  * date : 2017. 11. 4.
  * time : PM 11:41
  */
object LS5_3 {

  def numberSaver(number: Int): (Int) => Int = (x: Int) => x * number

  def main(args: Array[String]): Unit = {
    val fiveMultiplier = numberSaver(5)
    println(fiveMultiplier(4))
  }
}
