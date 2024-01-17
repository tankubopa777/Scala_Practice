package part2oop

object Objects {
  
    // SCALA DOES NOT HAVE CLASS-LEVEL FUNCTIONALITY ("static")
    object Person { // type + its only instance
      // "static"/"class" - level functionality
      val N_EYES = 2
      def canFly: Boolean = false
  
      // factory method
      def apply(mother: Person, father: Person): Person = new Person("Bobbie")
    }
  
    class Person(val name: String) {
      // instance-level functionality
    }
    // COMPANIONS
  
    def main(args: Array[String]): Unit = {
      println(Person.N_EYES)
      println(Person.canFly)
  
      // Scala object = SINGLETON INSTANCE
      val mary = Person
      val john = Person
      println(mary == john) // true
  
      val mary2 = new Person("Mary")
      val john2 = new Person("John")
      println(mary2 == john2) // false
  
      val bobbie = Person(mary2, john2)
  
      // Scala Applications = Scala object with
      // def main(args: Array[String]): Unit
    }
}
