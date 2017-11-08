package LS6

/**
  * user : Nolan (박재영) 
  * email : jypark88@coupang.com
  * date : 2017. 11. 9.
  * time : AM 1:12
  */
object LS6_4 {

  def maxLengthByFoldLeft(items: List[String]): String = {
    items.foldLeft("")((max, current) => if (max.length > current.length) max else current)
  }

  def maxLengthByReduce(items: List[String]): String = {
    items.reduce((next, current) => if (next.length > current.length) next else current)
  }

  def main(args: Array[String]): Unit = {
    val target = List("a", "bb", "ccc", "dddd")
    println(maxLengthByFoldLeft(target))
    println(maxLengthByReduce(target))
  }
}
