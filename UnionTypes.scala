object Hello extends App {

  /* difference to Either:
   *   Either is a 'sum type' (aka tagged union),
   *   which preserves structure (imagine
   *   Either[String, String], you could
   *   pattern match on whether it left or right).
   *
   * more on union vs sum:
   *  - https://milessabin.com/blog/2011/06/09/scala-union-types-curry-howard/
   *  - https://www.quora.com/What-is-a-sum-type
   */
  
  def sayHello(x: String | Int): Unit = x match {
      case s: String => println(s"hello, $s")
      case n: Int => println(s"hello, number $n")
    }

  // the type in scala would have been Seq[Any]
  val xs: Seq[String | Int] = Seq("foo", 1)

  /* weekday example from:
   *  - https://github.com/lampepfl/dotty/issues/1495#issuecomment-245001636
   *
   * doesn't compile, because singleton types are not 
   * allowed in union types:
   *   https://github.com/lampepfl/dotty/issues/1551
   */
  // object Monday
  // object Tuesday
  // object Wednesday
  // object Thursday
  // object Friday

  // object Saturday
  // object Sunday

  // type Weekday = Monday.type | Tuesday.type | Wednesday.type | Thursday.type | Friday.type
  // type Weekend = Saturday.type | Sunday.type
  // type AnyDay  = Weekday | Weekend

  // def main(args: Array[String]): Unit = {
  //   println("Monday is weekday: " + Monday.isInstanceOf[Weekday])
  //   println("Saturday is weekend: " + Saturday.isInstanceOf[Weekend])
  //   println("Sunday is weekday: " + Sunday.isInstanceOf[Weekday])

  //   (Monday: AnyDay) match {
  //     case _: Weekend => println("shouldn't match")
  //   }
  // }

}
