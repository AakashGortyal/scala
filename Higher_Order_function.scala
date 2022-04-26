package lectures.part3fp

import lectures.part3fp.HOFsCurries.superAdder

object Higher_Order_function extends App {
// example 1
  def math(a:Int, b:Int, fun:(Int,Int)=>Int):Int = fun(a,b)

  val sum = math(5, 6, (a,b) => a+b)
  val diff = math(10, 4, (a,b) => a-b)

  println(s"sum is $sum")
  println(s"diff is $diff")


  // example 2
  def math(c:Int, d:Int,e: Int, fun:(Int,Int)=>Int):Int = fun(fun(c,d),c)

  val sum1 = math(5, 6,7, (c,d) => c+d)
//  val sum1 = math(5, 6,7, (c,d) => _ + _)
  val diff1 = math(10, 4,1, (c,d) => c-d)

  println(s"sum is $sum1")
  println(s"diff is $diff1")


  // example 3
  // curried functions
  val superAdder: Int => (Int => Int) = (x: Int) => (y: Int) => x + y
  val add3 = superAdder(3)  // y => 3 + y
  println(add3(10))
  println(superAdder(3)(10))


  // example 4



  def functionExample(a:Int, f:Int=>AnyVal):Unit = {
    println(f(a))                                   // Calling that function
}
  def multiplyBy2(a:Int):Int = {
    a*2
}


  functionExample(25, multiplyBy2)                   // Passing a function as parameter

// example 5

/*
  def add2(a:Int):Int = {
    a+2
}

  def multiplyBy2(a:Int):Int = {
    a*2
}

  var result = multiplyBy2(add2(10))      // Function composition
  println(result)
*/
}




