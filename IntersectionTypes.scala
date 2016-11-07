trait Loud { def hello: String = "HELLOOO!" }
trait Mutable { def becomeQuiet: String = "being quiet now.." }

case class Person(name: String) extends Loud with Mutable

object Hello {

  /* kind of possible in scala with 'with', but
   * 'A with B' was not the same as 'B with A'.
   * '&' is commutative in dotty, meaning
   * 'A & B' is the same as 'B & A'
   */
  def sayHello(thing: Loud & Mutable): String =
    thing.hello + " " + thing.becomeQuiet

  
}
