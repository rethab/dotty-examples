object Foo {

  val one: 1 = 1
  val two: 2 = 2
  val three: 3 = one + two

  // error: found: Int(4), required: Int(3)
  // val three: 3 = two + two
  
  def four(x: 4): 4 = x
  
}
