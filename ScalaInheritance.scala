package lectures.part2oop
import math.Fractional.Implicits.infixFractionalOps
import math.Integral.Implicits.infixIntegralOps
import math.Numeric.Implicits.infixNumericOps

object ScalaInheritance extends App {
  // example 1
  class Employee {
    var salary: Float = 10000
  }

  class Programmer extends Employee {
    var bonus: Int = 5000
    println("Salary = " + salary)
    println("Bonus = " + bonus)
  }


  var obj = new Programmer()


  // example 2

  // single class inheritance
  class Animal {
    def eat = println("nomnom")
  }

  class Cat extends Animal {
  }

  val cat = new Cat
  cat.eat

  // example 3

  // single class inheritance

  // class A {
  // private def B = println("nomnom") // we can access only in the same class
  // }

  //class C extends A {
  //}

  // val cat = new C
  // cat.B


  // example 4


  class Animal2 {
    protected def eat2 = println("nomnom") // we can access only in the  sub class but not
    // outside the class
  }

  class Cat2 extends Animal2 {
    def crunch = {
      eat2
      println("crunch chrunch")

    }

  }

  val aat = new Cat2
  aat.crunch

  //}

  // overriding
  // example 5

  class Vehicle {
    def run(): Unit = {
      println("vehicle is running")
    }
  }

  class Bike extends Vehicle {
    override def run(): Unit = {
      println("Bike is running")
    }
  }


  var b = new Bike()
  b.run()

  // example 5

  class A {
    val creatureType = "Wild"

    def e1(): Unit = println("abc")
  }

  class B extends A {
    override val creatureType = "domestic"


    override def e1(): Unit = println("abcde")

  }

  val a: A = new A
  a.e1()
  println(a.creatureType)


  val c: A = new B
  c.e1()
  println(c.creatureType)


  // example 6:
  //class Vehicle1 {
  //  val speed:Int = 60

  //}

  //  class Bike1 extends Vehicle1 {
  //    override var speed:Int = 100
  //    def show(): Unit ={
  //      println(speed)
  //    }
  //  }

  //      var d = new Bike1()
  //      d.show()

  // method overloading

  //  class Arithmetic{
  //   def add(a:Int, b:Int): Unit ={
  //       var sum = a + b
  //       println(sum)

  //     def add(a:Int, b:Int, c:Int): Unit ={
  //       var sum = a + b + c
  //       println(sum)
  //}

  // var a2  = new Arithmetic();
  // a2.add(10,10);
  // a2.add(10,10);
  //}
  //}

  // final

  //example  8

  //  class Vehicle3 {
  //    final val speed:Int = 60
  //  }
  //  class Bike3 extends Vehicle3 {
  //    override val speed:Int = 100
  //    def show(): Unit ={
  //      println(speed)
  //  }


  //  var b3 = new Bike3()
  //  b3.show()
  //we can't override final variables in subclassYou can't override final variables in subclass

  // access modifier

  // example 9
  /*
class AccessExample{
  private var a:Int = 10
  def show(): Unit ={
    println(a)
  }
}
      var p = new AccessExample()
      p.a = 12
      p.show()

}
*/

  // example 10

  class AccessExample {
    protected var z: Int = 10
  }

  class SubClass extends AccessExample {
    def display(): Unit = {
      println("a = " + z)
    }

    var s = new SubClass()
    s.display()
  }
}