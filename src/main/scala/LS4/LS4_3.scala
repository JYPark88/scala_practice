package LS4

import scala.annotation.tailrec

/**
  * user : Nolan (박재영) 
  * email : jypark88@coupang.com
  * date : 2017. 10. 16.
  * time : PM 1:43
  */
object LS4_3 {

  @tailrec
  def fiveSeeker(n: Int, t: Int = 5): Unit = {
    if (n > 0) {
      println(t)
      fiveSeeker(n - 1, t + 5)
    }
  }

  def main(args: Array[String]): Unit = {
    fiveSeeker(10)
  }
}
