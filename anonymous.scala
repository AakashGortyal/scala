package lectures.part3fp

import lectures.part3fp.AnonymousFunctions.justDoSomething

object anonymous extends App {
/*
  val doubler = new function1[Int,Int] {
    override def apply(x: Int) = x * 2
  }
*/

// lambda
 // val double = (x : Int) => x * 2
// val doubler: Int => Int = x => x * 2


// multiple parameter

 val adder: (Int , Int ) => Int = (a : Int, b:Int) => a + b

 // no parameter

  val justDoSomething: () => Int = () => 3

  // careful
  println(justDoSomething) // function itself
  println(justDoSomething()) // call

  // curly braces with lambdas
  val stringToInt = { (str: String) =>
    str.toInt
  }

// example 1

 var anon = (x: String , y: String, z:String) => x + "hello" + y + " " + z
 var result = anon("start1","start2","start3")
 println(result)

// example 2

  val d = (i: Int) => { i * 2 }
  println(d(3))

// example 3

  def getOps2(c: Int) = {
    if (c > 0) (i: Int) => i * 2
    else (i: Int) => i * 3
  }

  getOps2(-1)

// example 4





}
