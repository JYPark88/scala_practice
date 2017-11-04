package LS4

import scala.annotation.tailrec

/**
  * user : Nolan (박재영) 
  * email : jypark88@coupang.com
  * date : 2017. 10. 16.
  * time : PM 2:14
  */
object LS4_5 {

  @tailrec
  def ownPow(a: Long, b: Long, t: Long = 1): Long= {
    if (b < 1) t
    else ownPow(a, b - 1, t * a)
  }

  def main(args: Array[String]): Unit = {
    println(ownPow(2, 50))
  }
}
