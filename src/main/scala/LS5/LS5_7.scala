package LS5

/**
  * user : Nolan (박재영) 
  * email : jypark88@coupang.com
  * date : 2017. 11. 5.
  * time : AM 12:39
  */
object LS5_7 {

  def conditional[A, B](x: A, p: A => Boolean, f: A => B): Unit = if (p(x)) f(x)

  def main(args: Array[String]): Unit = {
    for (i <- 1 to 100) {
      conditional(
        i,
        (x: Int) => x % 3 == 0 || x % 5 == 0,
        (x: Int) => println(s"${if (x % 3 == 0) "type" else ""}${if (x % 5 == 0) "safe" else ""}")
      )
    }
  }
}
