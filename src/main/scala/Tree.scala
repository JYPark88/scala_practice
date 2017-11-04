/**
  * user : Nolan (박재영) 
  * email : jypark88@coupang.com
  * date : 2017. 9. 17.
  * time : PM 4:47
  */
abstract class Tree
case class Sum(l: Tree, r: Tree) extends Tree
case class Var(n: String) extends Tree
case class Const(v: Int) extends Tree
