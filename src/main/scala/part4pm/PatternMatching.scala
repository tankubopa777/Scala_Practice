package part4pm

object PatternMatching extends App {

    // switch on steroids
    val x = 2
    val order = x match {
      case 1 => "first"
      case 2 => "second"
      case 3 => "third"
      case _ => x + "th"
    }

    // PM is an expression
    val order2 = x match {
      case 1 => "first"
      case 2 => "second"
      case 3 => "third"
      case _ => x + "th"
    }

    // PM can decompose values
    case class Person(name: String, age: Int)

    val bob = Person("Bob", 20)
    val greeting = bob match {
      case Person(n, a) => s"Hi, my name is $n and I am $a years old"
      case _ => "I don't know who I am"
    }

    // PM on sealed hierarchies
    sealed class Animal

    case class Dog(breed: String) extends Animal

    case class Parrot(greeting: String) extends Animal

    val animal: Animal = Dog("Terra Nova")
    animal match {
      case Dog(someBreed) => println(s"Matched a dog of the $someBreed breed")
    }

    // match everything
    val isEven = x match {
      case n if n % 2 == 0 => true
      case _ => false
    }

    // why?
    val isEvenCond = if (x % 2 == 0) true else false // ?!
    val isEvenNormal = x % 2 == 0

    /*
      Exercise
      simple function uses PM
        takes an Expr => human readable form

        Sum(Number(2), Number(3)) => 2 + 3
        Sum(Number(2), Number(3), Number(4)) => 2 + 3 + 4
        Prod(Sum(Number(2), Number(1)), Number(3)) => (2 + 1) * 3
        Sum(Prod(Number(2), Number(1)), Number(3)) => 2 * 1 + 3
    */

    trait Expr

    case class Number(n: Int) extends Expr

    case class Sum(e1: Expr, e2: Expr) extends Expr

    case class Prod(e1: Expr, e2:
    Expr) extends Expr
}
