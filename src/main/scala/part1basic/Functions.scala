package part1basic

object Functions extends App{
  def aFunction(a: String, b: Int): String = {
    a + " " + b
  }

  println(aFunction("hello", 3))

  def aParameterlessFunction(): Int = 42
  println(aParameterlessFunction())

  def aRepeatedFunction(aString: String, n: Int): String = {
    if (n == 1) aString
    else aString + aRepeatedFunction(aString, n-1)
  }

  println(aRepeatedFunction("hello", 3))
  //WHEN YOU NEED LOOPS, USE RECURSION

  def aFunctionWithSideEffects(aString: String): Unit = println(aString)

//  def aBigFunction(n: Int): Int = {
//    def aSmallerFunction(a: Int, b: Int): Int = a + b
//    aSmallerFunction(n, n-1)
//  }

  def helloMyfriend(name: String, age: Int) : String = {
    "Hello my friend my name" + name + " Na krub " + age + " years old"
  }
  println(helloMyfriend("Yad", 21))

  //Factorial.
  def factorial(number: Int): Int = {
    if (number == 1) number
    else (number) * factorial(number - 1)
  }
  println(factorial(5))

  //Fibonacci Function.
  def fibonacci(number: Int): Int = {
    if (number <= 1) 1
    else fibonacci(number-1) + fibonacci(number-2)
  }
  println(fibonacci(2))

  //Test if a number is prime.
  def checkPrimeNumber(number: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean = 
      if (t<=1) true
      else number % t != 0 && isPrimeUntil(t-1)
    isPrimeUntil(number/2)
    
  }

}
