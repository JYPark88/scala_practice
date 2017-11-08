package LS6

/**
  * user : Nolan (박재영) 
  * email : jypark88@coupang.com
  * date : 2017. 11. 9.
  * time : AM 1:19
  */
object LS6_5 {

  def reverseList[A](items: List[A]): List[A] = items match {
    case head :: tail => reverseList(tail) :+ head
    case Nil => Nil
  }

  def main(args: Array[String]): Unit = {
    println(reverseList(List(1,2,3,4,5,6,7,8,9)))
  }
}
