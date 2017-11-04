package LS3

/**
  * user : Nolan (박재영) 
  * email : jypark88@coupang.com
  * date : 2017. 10. 6.
  * time : PM 6:24
  */
object LS3_2 {

  def zeroComparator(input: Integer): String = input match {
    case num if num > 0 => "greater"
    case num if num < 0 => "less"
    case _ => "same"
  }

  def main(args: Array[String]): Unit = {
    println(zeroComparator(0))
  }
}
