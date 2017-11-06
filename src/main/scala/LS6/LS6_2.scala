package LS6

/**
  * user : Nolan (박재영) 
  * email : jypark88@coupang.com
  * date : 2017. 11. 7.
  * time : AM 12:14
  */
object LS6_2 {

  def factors(number: Int): List[Int] = {
    val max = Math.sqrt(number).floor.toInt
    (for (i <- 2 to max if number % i == 0) yield i).flatMap(i => List(i, number / i)).toSet.toList.sortWith(_ < _)
  }

  def main(args: Array[String]): Unit = {
    println(factors(100))
  }
}
