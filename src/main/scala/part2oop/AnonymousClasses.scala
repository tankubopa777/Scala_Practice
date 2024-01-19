package part2oop

object AnonymousClasses extends App{

    abstract class Animal{
      def eat: Unit
    }

    //anonymous class
    val funnyAnimal: Animal = new Animal {
      override def eat: Unit = println("hahahahahahah")
    }

    println(funnyAnimal.getClass)

    class Person(name: String){
      def sayHi: Unit = println(s"Hi, my name is $name, how can I help?")
    }

    val jim = new Person("Jim"){
      override def sayHi: Unit = println(s"Hi, my name is Jim, how can I be of service?")
    }

    println(jim.sayHi)

    /*
    1. Generic trait MyPredicate[-T] with a little method test(T) => Boolean
    2. Generic trait MyTransformer[-A, B] with a method transform(A) => B
    3. MyList:
        - map(transformer) => MyList
        - filter(predicate) => MyList
        - flatMap(transformer from A to MyList[B]) => MyList[B]
        class EvenPredicate extends MyPredicate[Int]
        class StringToIntTransformer extends MyTransformer[String, Int]
        [1,2,3].map(n * 2) = [2,4,6]
        [1,2,3,4].filter(n % 2) = [2,4]
        [1,2,3].flatMap(n => [n, n+1]) => [1,2,2,3,3,4]
     */
      
    trait MyPredicate[-T]{
      def test(elem: T): Boolean
    }
    
    trait MyTransformer[-A, B]{
      def transform(elem: A): B
    }
    
    abstract class MyList[+A]{
      def head: A
      def tail: MyList[A]
      def isEmpty: Boolean
      def add[B >: A](element: B): MyList[B]
      def printElements: String
      override def toString: String = "[" + printElements + "]"
      //higher-order functions
      def map[B](transformer: MyTransformer[A, B]): MyList[B]
      def flatMap[B](transformer: MyTransformer[A, MyList[B]]): MyList[B]
      def filter(predicate: MyPredicate[A]): MyList[A]
      //concatenation
      def ++[B >: A](list: MyList[B]): MyList[B]
    }
      



}
