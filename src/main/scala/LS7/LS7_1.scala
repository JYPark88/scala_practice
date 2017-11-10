package LS7

import scala.annotation.tailrec
import scala.collection.mutable

/**
  * user : Nolan (박재영) 
  * email : jypark88@coupang.com
  * date : 2017. 11. 11.
  * time : AM 3:02
  */
object LS7_1 {

  @tailrec
  def fiboBuffer(n: Int, buffer: mutable.Buffer[BigInt] = mutable.Buffer()): List[BigInt] = {
    if (n == 0) buffer.toList
    else {
      buffer.length match {
        case x if x > 1 => fiboBuffer(n - 1, buffer += (buffer(x - 1) + buffer(x - 2)))
        case _ => fiboBuffer(n - 1, buffer += 1)
      }
    }
  }

  @tailrec
  def addFibo(list: List[BigInt], n: Int): List[BigInt] = {
    if (n == 0) list
    else list.length match {
      case x if x > 1 => addFibo(list :+ list.slice(list.length - 2, list.length).sum, n - 1)
      case _ => addFibo(list :+ BigInt(1), n - 1)
    }
  }

  def fiboStream(first: BigInt = 1, second: BigInt = 1): Stream[BigInt] =
    first #:: fiboStream(second, first + second)

  def fibNext(target: Int): Option[BigInt] = {
    val list = fiboStream().takeWhile(_ <= target).toList
    println(list)
    if (list.length > 1) {
      if (list.last == target) {
         return Option(list drop (list.length - 2) sum)
      }
      return None
    }
    if (target == 1) {
      return Option(1)
    }
    None
  }

  def main(args: Array[String]): Unit = {
    val init = fiboBuffer(3)
    println(init)
    val second = addFibo(init, 3)
    println(second)
    val third = fiboStream().take(100).toList
    for (i <- third zipWithIndex) {
      if (i._2 % 10 == 9) println(i._1)
      else print(s"${i._1},")
    }
    println(fibNext(6))
  }
}
