package lectures.part3fp

object map_filter extends App {

  // example 1
  val mapIm = Map("Ajay" -> 30,
    "Bhavesh" -> 20,
    "Charlie" -> 50)

  // Accessing score of Ajay
  val ajay = mapIm("Ajay")
  println(ajay)


  // example 2
/*
  val mapIm1 = Map("Ajay" -> 30,
    "Bhavesh" -> 20,
    "Charlie" -> 50)

  // the key check in the Map
  val ajay1 = if(mapIm1.contains("Ajay"))
    mapIm("Ajay") else 0

  val john1 = if(mapIm1.contains("John"))
    mapIm1("John") else 0

  println("Ajay:" + ajay)
  println("John:" + john)

*/


// example 3

  val mapMut = scala.collection.mutable.Map("Ajay" -> 30,
    "Bhavesh" -> 20,
    "Charlie" -> 50)
  println("Before Updating: " + mapMut)

  // Updating
  mapMut("Ajay") = 10

  println("After Updating: " + mapMut)


// example 4

  val mapMut1 = scala.collection.mutable.Map("Ajay" -> 30,
    "Bhavesh" -> 20,
    "Charlie" -> 50)

  println("Before Adding: "+mapMut1)

  // Adding a new key "Dinesh" and
  // updating an existing key "Ajay"
  mapMut1 += ("Ajay" -> 10, "Dinesh" -> 60)

  println("After Adding: "+mapMut1)




// example 5:
val mapMut2 = scala.collection.mutable.Map("Ajay" -> 30,
  "Bhavesh" -> 20,
  "Charlie" -> 50)

  println("Before Deleting: "+mapMut2)

  // Deleting key-value pairs with
  // keys "Ajay" and "Charlie"
  mapMut2 -= ("Ajay", "Charlie")

  println("After Deleting: " + mapMut2)



// example 6

  val mapMut3 = scala.collection.mutable.Map("Ajay" -> 30,
    "Bhavesh" -> 20,
    "Charlie" -> 50)

  // (k, v) is a tuple with two elements
  for((k, v) <- mapMut3)
  {
    //where k is key and v is value
    print("Key:"+k+", ")
    println("Value:"+v)
  }

// flatmap example

// example 1:
  val name = Seq("Nidhi", "Singh")
  val result1 = name.map(_.toLowerCase)

  val result2 = result1.flatten
  val result3 = name.flatMap(_.toUpperCase)
  print(result2)
  println(result3)

// example 2:


  val list = List(2, 3, 4)

  def f(x:Int) = List(x-1, x, x+1)

  val result = list.flatMap(y => f(y))

  println(result)

// example 3:

  val seq = Seq(8, 15, 22, 23, 24)

  val result4 = seq flatMap { s =>
    if (s % 3 == 0) Seq(s)
    else Seq(-s)
  }
  println(result4)

//  print all combinations between two lists
  val numbers = List(1,2,3,4)
  val chars = List('a','b','c','d')
  val colors = List("black", "white")

  // List("a1", "a2"... "d4")

  // "iterating"
  val combinations = numbers.filter(_ % 2 == 0).flatMap(n => chars.flatMap(c => colors.map(color => "" + c + n + "-" + color)))
  println(combinations)
}
