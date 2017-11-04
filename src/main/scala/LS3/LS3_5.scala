package LS3

/**
  * user : Nolan (박재영) 
  * email : jypark88@coupang.com
  * date : 2017. 10. 6.
  * time : PM 6:49
  */
object LS3_5 {

  def typeSafeOneToHundred():Unit = {
    for (
      i <- 1 to 100
      if i % 3 == 0 || i % 5 == 0
    ) {
      val result = if (i % 3 == 0) "type" else ""
      println(if (i % 5 == 0) result + "safe" else result)
    }
  }

  def main(args: Array[String]): Unit = {
    typeSafeOneToHundred()
  }
}
