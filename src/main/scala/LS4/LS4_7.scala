package LS4

/**
  * user : Nolan (박재영) 
  * email : jypark88@coupang.com
  * date : 2017. 10. 16.
  * time : PM 2:30
  */
object LS4_7 {

  def intFirst(tuple: (Any, Any)): (Any, Any) = tuple match {
    case (_, _) => (tuple._2, tuple._1)
    case _ => tuple
  }

  def main(args: Array[String]): Unit = {
    println(intFirst("t", 2))
  }
}
