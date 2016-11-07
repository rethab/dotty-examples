
object Main extends App {

  println("int equal to float? " + (1 == 1f))

  /* feature is generally opt-in. if there is a
   * corresponding 'Eq',  the stronger checks 
   * are enabled (backwards compatibility).
   *
   * while the below worked in scala, it no
   * longer works in dotty, because a number
   * of standard 'Eq' instances are defined
   * in Predef.
   */
  // val stringInt: Boolean = "foo" == 1

  /* tell the compiler that strings and booleans
   * can be checked for equality by marking it 
   * with the 'Eq' typeclass. will still return
   * false though */
  implicit def eqSB: Eq[String, Boolean] = Eq
  println("string equal to boolean? " + ("yes" == true))


  /* goal:
   *   'CustomPackage("x") == Itinerary("y")'
   *  --> should not compile
   */
  trait TravelPackage
  case class CustomPackage(refId: String) extends TravelPackage
  case class Itinerary(refId: String) extends TravelPackage
  implicit def eqCP: Eq[CustomPackage, CustomPackage] = Eq
  implicit def eqI: Eq[Itinerary, Itinerary] = Eq
  // val cpI: Boolean = CustomPackage("x") == Itinerary("y")
  // --> would compile if we had an 'Eq[TravelPackage, TravelPackage]'


}
