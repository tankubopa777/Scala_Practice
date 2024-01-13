package path1basic

object Expression extends App{
  val x = 1 + 2
  println(x)

  println(2 + 3 * 4)
  // + - * / & | ^ << >> >>> (right shift with zero extension)

  println(1 == x)
  // == != > >= < <=

  println(!(1 == x))
  // ! && ||

//  var aVariable = 2
//  aVariable += 3 // also works with -= *= /= ... side effects
//  println(aVariable)

  // Instructions (DO) vs Expressions (VALUE)

  // IF expression
//  val aCondition = false
//  val aConditionedValue = if(aCondition) 5 else 3 // IF expression
//  println(aConditionedValue)

  var i = 0
  while (i < 10) {
    println(i)
    i += 1
  }
  // NEVER WRITE THIS AGAIN

  // EVERYTHING in Scala is an Expression!
  //  val aWeirdValue = (aVariable = 3) // Unit === void

  // Code blocks
  val aCodeBlock = {
    val y = 2
    val z = y + 1

    if (z > 2) "hello" else "goodbye"
  }

}
