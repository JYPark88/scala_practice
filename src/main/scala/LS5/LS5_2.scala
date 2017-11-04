package LS5

import scala.util.Random

/**
  * user : Nolan (박재영) 
  * email : jypark88@coupang.com
  * date : 2017. 11. 4.
  * time : PM 9:59
  */
object LS5_2 {

  def getMaxNumber(a: Int, b: Int, f: (Int, Int) => Int): Int =
    (1 to 3).fold(f(a, b))((res: Int, _) => f(res, Random.nextInt()))

  def main(args: Array[String]): Unit = {
    println(getMaxNumber(1, 2, Math.max ))
  }
}
