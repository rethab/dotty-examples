import annotation.static

object Hello extends App {

  println(Singleton.x)
  
}


object Singleton {

  /* makes field a 'real' java static. regular
   * fields an methods are not compiled to
   * statics, but are singleton objects.
   *
   * from Daniel C Sobral's comment on SO:
   *  "Singletons are full objects like any
   *   other: they belong to a class, may have
   *   interfaces, may have a constructor,
   *   one can pass it around like any other
   *   object, call methods on it, use
   *   reflection, check for class type and
   *   cast them."
   *  --> http://stackoverflow.com/a/4492841/1080523
   */
  @static val x: Int = 0
  
}

/* objects with singleton fields need a companion class */
class Singleton
