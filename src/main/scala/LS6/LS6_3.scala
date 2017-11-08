package LS6

/**
  * user : Nolan (박재영) 
  * email : jypark88@coupang.com
  * date : 2017. 11. 9.
  * time : AM 12:39
  */
object LS6_3 {

  def first[A](items: List[A], count: Int): List[A] = items match {
    case head :: tail if count > 0 => head :: first(tail, count - 1)
    case _ => Nil
  }

  def main(args: Array[String]): Unit = {
    println(first(List(1,2,3,4,5), 3))
  }
}
