/**
  * user : Nolan (박재영) 
  * email : jypark88@coupang.com
  * date : 2017. 9. 17.
  * time : PM 4:29
  */
class Complex(real: Double, imaginary: Double) {
  def re: Double = real
  def im: Double = imaginary

  override def toString: String =
    "" + re + (if (im < 0) "" else "+") + im + "i"
}
