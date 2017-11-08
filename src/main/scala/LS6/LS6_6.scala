package LS6

/**
  * user : Nolan (박재영) 
  * email : jypark88@coupang.com
  * date : 2017. 11. 9.
  * time : AM 1:23
  */
object LS6_6 {

  def isPalindrome(word: String): Boolean = {
    val length = word.length
    val medium = length / 2
    if (length % 2 == 0) {
      return word.slice(0, medium) == word.slice(medium, length).reverse
    }

    word.slice(0, medium) == word.slice(medium + 1, length).reverse
  }

  def partitionPalindrome(items: List[String]): (List[String], List[String]) = {
    items.foldLeft((List.empty[String], List.empty[String]))((result, current) => {
      if (isPalindrome(current)) {
        (result._1 :+ current, result._2)
      } else {
        (result._1, result._2 :+ current)
      }
    })
  }

  def main(args: Array[String]): Unit = {
    val target = List("eye", "madam", "level", "hannah", "fox", "wolf")
    println(partitionPalindrome(target))
  }
}
