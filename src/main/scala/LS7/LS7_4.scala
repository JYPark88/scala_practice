package LS7

import scala.util.{Success, Try}

/**
  * user : Nolan (박재영) 
  * email : jypark88@coupang.com
  * date : 2017. 11. 12.
  * time : PM 5:27
  */
object LS7_4 {

  def multiply(a: String, b: String): Option[Int] = {
    (Try(a.toInt), Try(b.toInt)) match {
      case (Success(x), Success(y)) => Option(x * y)
      case _ => Option.empty
    }
  }

  def main(args: Array[String]): Unit = {
    println(multiply("2", "A_").getOrElse(-1))
  }
}
