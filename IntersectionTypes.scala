trait Loud { def hello: String = "HELLOOO!" }
trait Mutable { def becomeQuiet: String = "being quiet now.." }

case class Person(name: String) extends Loud with Mutable

object Hello {

  def sayHello(thing: Loud & Mutable): String =
    thing.hello + " " + thing.becomeQuiet

  
}
