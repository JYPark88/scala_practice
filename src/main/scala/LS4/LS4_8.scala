package LS4

/**
  * user : Nolan (박재영) 
  * email : jypark88@coupang.com
  * date : 2017. 10. 16.
  * time : PM 2:36
  */
object LS4_8 {

  def toQuoteStringTuple(value: Any): String = s""""${value.toString}""""

  def tupleAmplifier(tuple: (Any, Any, Any)): (Any, String, Any, String, Any, String) =
    (tuple._1 , toQuoteStringTuple(tuple._1), tuple._2, toQuoteStringTuple(tuple._2), tuple._3, toQuoteStringTuple(tuple._3))

  def main(args: Array[String]): Unit = {
    println(tupleAmplifier(true, 22.25, "yes"))
  }
}
