package LS6

/**
  * user : Nolan (박재영) 
  * email : jypark88@coupang.com
  * date : 2017. 11. 6.
  * time : PM 11:59
  */
object LS6_1 {

  def oddListWithFor(): List[Int] = {
    (for (i <- 1 to 20 if i % 2 == 1) yield i) toList
  }

  def oddListWithFilter(): List[Int] = {
    (1 to 20) filter (_ % 2 == 1) toList
  }

  def oddListWithMap(): List[Int] = {
    (1 to 10) map (_ * 2 - 1) toList
  }

  def main(args: Array[String]): Unit = {
    println(oddListWithFor())
    println(oddListWithFilter())
    println(oddListWithMap())
  }
}
