package LS3

/**
  * user : Nolan (박재영) 
  * email : jypark88@coupang.com
  * date : 2017. 10. 6.
  * time : PM 6:57
  */
object LS3_6 {

  def typeSafeOneToHundredOneLiner():Unit = {
    for (i <- 1 to 100 if i % 3 == 0 || i % 5 == 0) println(s"${if (i % 3 == 0) "type" else ""}${if (i % 5 == 0) "safe" else ""}")
  }

  def main(args: Array[String]): Unit = {
    typeSafeOneToHundredOneLiner()
  }
}
