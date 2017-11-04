package LS5

/**
  * user : Nolan (박재영) 
  * email : jypark88@coupang.com
  * date : 2017. 11. 4.
  * time : PM 11:58
  */
object LS5_5 {

  def square(m: Double): Double = m * m

  def main(args: Array[String]): Unit = {
    val sq = (x: Int) => square(x)
    val sq2 = sq

    println(sq2(12))
  }
}
