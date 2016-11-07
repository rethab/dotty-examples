sealed trait Base { def x: String }
case class A(x: String) extends Base
case class B(x: String) extends Base
case class C(x: String) extends Base

object Hello extends App {
  
  def sayHello(x: String | Int): Unit = x match {
      case s: String => println(s"hello, $s")
      case n: Int => println(s"hello, number $n")
    }

  def safety(x: A | B): Unit = x match {
      case a: A => println(s"It's an ${a.x}")
      case b: B => println(s"It's an ${b.x}")
      case c: C => println(s"It's an ${c.x}")
    }
    
}
