package part2oop

object OOBasics extends App{
  val person = new Person("John", 26)
  val writer = new Writer("Warunporn", "Intarachana", 21)
//  println(person.age)
//  println(person.x)
//  person.greet("Daniel")
//  person.greet()

  writer.fullName()
}

// constructor
class Person(name: String,val age: Int) {
  // body
  val x = 2

  println(1 + 3)

  // method
  def greet(name: String): Unit = println(s"${this.name} says: Hi, $name")

  // overloading
  def greet(): Unit = println(s"Hi, I am $name")

  // multiple constructors
  def this(name: String) = this(name, 0)
  def this() = this("John Doe")
}

// class parameters are NOT FIELDS

/*
  Novel and a Writer

  Writer: first name, surname, year
    - method fullname

  Novel: name, year of release, author
    - authorAge
    - isWrittenBy(author)
    - copy (new year of release) = new instance of Novel
 */

class Writer(val firstname : String, val surname : String, val year: Int ){
  def fullName(): Unit = print(s"$firstname $surname")
}

class Novel(val name: String,val yearOfRelease: Int, val author: String){

  def authorAge(age: Int) :Unit = println(s"$author ")

  def isWrittenBy(author : String) : Unit = println(s"${this.author}")

  def copy(yearOfRelease : Int ) : Unit = println(s"${this.yearOfRelease}")

}

class Counter(val receives : Int ){
  def count = receives
  def inc = new Counter(receives + 1) // immutability
  def dec = new Counter(receives - 1)
  def inc(n: Int) = new Counter(receives + n)
  def dec(n: Int) = new Counter(receives - n)

}