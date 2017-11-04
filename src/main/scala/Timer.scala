/**
  * user : Nolan (박재영) 
  * email : jypark88@coupang.com
  * date : 2017. 9. 17.
  * time : PM 4:25
  */
object Timer {

  def oncePerSecond(callback: () => Unit) {
    while (true) { callback(); Thread.sleep(1000) }
  }

  def timeFlies() {
    println("time flies like an arrow...")
  }

  def main(args: Array[String]) {
    oncePerSecond(timeFlies)
  }

}
