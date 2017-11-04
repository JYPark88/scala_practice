package LS3

/**
  * user : Nolan (박재영) 
  * email : jypark88@coupang.com
  * date : 2017. 10. 6.
  * time : PM 6:15
  */
object LS3_1 {

  def getName(name: String): String = name match {
    case target if target.length > 0 => target
    case _ => "n/a"
  }

  def main(args: Array[String]): Unit = {
    println(getName(""))
  }
}
