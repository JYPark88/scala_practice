package LS5

/**
  * user : Nolan (박재영) 
  * email : jypark88@coupang.com
  * date : 2017. 11. 4.
  * time : PM 11:48
  */
object LS5_4 {

  def fZero[A](x: A)(f: A => Unit): A = { f(x); x }

  def main(args: Array[String]): Unit = {
    val result = fZero(1)((x: Int) => println(x))
    println(result)
  }
}
