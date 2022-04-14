package lectures.part2oop

import lectures.part2oop.AbstractDataTypes.{Animal, Crocodile, Dog}

object ScalaAbstractClass extends  App {


  // example 1
  abstract class Animal {
    val creatureType: String
    def eat: Unit
  }
// we will not pass any arguments we just give the methods and values
// we cannot create abject of abstract class



// val animal = new Animal // we cannot create object because we are not implementing abstract class

  class Dog extends Animal {
    override val creatureType: String = "Canine"
    def eat: Unit = println("crunch crunch")
  }

 // val dog = new Dog
 // dog.eat
 // dog.creatureType

  // traits
  trait Carnivore {
    def eat(animal: Animal): Unit
    val preferredMeal: String = "fresh meat"
  }

  trait ColdBlooded
  class Crocodile extends Animal with Carnivore with ColdBlooded {
    override val creatureType: String = "croc"
    def eat: Unit = println("nomnomnom")
    def eat(animal: Animal): Unit = println(s"I'm a croc and I'm eating ${animal.creatureType}")
  }
  val dog = new Dog
  val croc = new Crocodile
  croc.eat(dog)

  // example 2

abstract class Bike {
  def fuelCapacity() = "bike fuel is 15 liter"

  def geartype(): String
}

class Pulsar extends Bike {
  override def geartype(): String = " 5 stroke"


val pulsarBike = new Pulsar
println(pulsarBike.geartype())
println(pulsarBike.fuelCapacity())

}

}


