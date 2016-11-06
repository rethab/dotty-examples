
trait HelloSupport (lang: String) {

  def hello: String = lang match {
      case "en" => "hello, world"
      case "de" => "hallo, welt"
    }
  
}



object Main extends App with HelloSupport(lang = "en") {

  println(hello)
  
}

