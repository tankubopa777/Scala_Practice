package part2oop

object InheritanceAndTraits extends App{

  class Animal {
    val creatureType = "wild"
    def eat = println("nomnom")
  }
  class Cat extends Animal {
    def crunch = {
      eat
      println("crunch crunch")
    }
  }

  //constructors
  class Person(name: String, age: Int) {
    def this(name: String) = this(name, 0)
  }
  class Adult(name: String, age: Int, idCard: String) extends Person(name)

  //overriding
//  class Dog(override val creatureType: String) extends Animal {
    //override val creatureType = "domestic"
//    override def eat = {
//      super.eat
//      println("crunch, crunch")
//    }

   class Dog(dogType: String) extends Animal {
     override val creatureType: String = dogType
     override def eat: Unit = println("crunch, crunch")


    val dog = new Dog("K9")
    dog.eat
    println(dog.creatureType)

    //type substitution (broad: polymorphism)
    val unknownAnimal: Animal = new Dog("K9")
    unknownAnimal.eat

    //overRIDING vs overLOADING
  }
}
