package LS5

/**
  * user : Nolan (박재영) 
  * email : jypark88@coupang.com
  * date : 2017. 11. 5.
  * time : AM 12:15
  */
object LS5_6 {

  def conditional[A](x: A, p: A => Boolean, f: A => A): A = if (p(x)) f(x) else x

  def main(args: Array[String]): Unit = {
    println(conditional(13, (x: Int) => x % 2 == 0, (x: Int) => x * 2))
  }
}
