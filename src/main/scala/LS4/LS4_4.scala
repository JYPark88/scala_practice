package LS4

/**
  * user : Nolan (박재영) 
  * email : jypark88@coupang.com
  * date : 2017. 10. 16.
  * time : PM 2:10
  */
object LS4_4 {

  def millsToDateTime(milliseconds: Long): Unit = {
    println(s"days    ${milliseconds / 1000 / 60 / 60 / 24}")
    println(s"hours   ${milliseconds / 1000 / 60 / 60}")
    println(s"minutes ${milliseconds / 1000 / 60}")
    println(s"seconds ${milliseconds / 1000}")
  }

  def main(args: Array[String]): Unit = {
    millsToDateTime(10000000)
  }
}
