package LS3

/**
  * user : Nolan (박재영) 
  * email : jypark88@coupang.com
  * date : 2017. 10. 6.
  * time : PM 6:29
  */
object LS3_4 {

  def fiveLinebreakPrint(): Unit = {
    for (i <- 1 to 100) {
      if (i % 5 == 0) {
        println(i)
      } else {
        print(i + ",")
      }
    }
  }

  def main(args: Array[String]): Unit = {
    fiveLinebreakPrint()
  }
}
