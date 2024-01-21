package part2oop

object Exceptions extends App{
  val x: String = null
  //println(x.length)
  //this will crash with a null pointer exception

  //1. throwing exceptions
//val aWeirdValue: String = throw new NullPointerException

  //throwable classes extend the Throwable class
  //Exception and Error are the major Throwable subtypes

  //2. how to catch exceptions
  def getInt(withExceptions: Boolean): Int =
    if(withExceptions) throw new RuntimeException("No int for you")
    else 42

  try {
    //code that might throw
    getInt(true)
  } catch {
    case e: RuntimeException => println("caught a Runtime exception")
  } finally {
    //code that will get executed no matter what
    //optional
    //does not influence the return type of this expression
    //use finally only for side effects
    println("finally")
  }
}
