package LS7

import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.Success

/**
  * user : Nolan (박재영) 
  * email : jypark88@coupang.com
  * date : 2017. 11. 11.
  * time : AM 2:42
  */
object FuturePractice {

  def cityTemp(name: String): Double ={
    val url = "http://api.openweathermap.org/data/2.5/weather"
    val cityUrl = s"$url?APPID=72bf27b20bf867de6236aca3a257e0d1&q=$name"
    val json = io.Source.fromURL(cityUrl).mkString.trim
    val pattern = """.*"temp":([\d.]+).*""".r
    val pattern(temp) = json
    temp.toDouble
  }

  def main(args: Array[String]): Unit = {
    val cityTemps = Future sequence Seq(
      Future(cityTemp("Fresno")), Future(cityTemp("Tempe"))
    )


    cityTemps onComplete {
      case Success(Seq(x,y)) => println(x, y)
    }

    Thread.sleep(5000)

  }
}
