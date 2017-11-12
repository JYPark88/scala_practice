package LS7

import java.io.File

/**
  * user : Nolan (박재영) 
  * email : jypark88@coupang.com
  * date : 2017. 11. 12.
  * time : PM 4:53
  */
object LS7_2 {

  def main(args: Array[String]): Unit = {
    val result = new File(".").listFiles
      .map(file => file.toString.slice(2, file.toString.length))
      .mkString(";")

    println(result)
  }
}
