package lectures.part3fp

import lectures.part3fp.TuplesAndMaps.phonebook

object sequence extends App {

  // examples: 1

  var seq: Seq[Int] = Seq(1, 2, 3, 4, 5, 6)


  println("\nElements Access Using Index")
  println(seq(0))
  println(seq(1))
  println(seq(2))
  println(seq(3))
  println(seq(4))
  println(seq(5))

  // example: 2

  var seq1: Seq[Int] = Seq(1, 2, 3, 4, 5, 6)

  // Printing Sequence
  // seq.foreach((element:Int) => print(element+","))

  // Using Some Predefined Methods
  println("\nis Empty: " + seq1.isEmpty)
  println("\nEnds with (5,6): " + seq1.endsWith(Seq(5, 6)))
  println("\nLength of sequence: " + seq1.length)
  println("\ncontains 3: " + seq1.contains(3))
  println("\nlast index of 4 : " + seq1.lastIndexOf(4))
  println("\nReversed sequence: " + seq1.reverse)


  // example:3

  var seq2: Seq[Int] = Seq(52, 85, 1, 8, 3, 2, 7)
  seq2.foreach((element: Int) => print(element + " "))
  println("\nAccessing element by using index")
  println(seq2(2))

  // example 4:

  // Ranges
  val aRange: Seq[Int] = 1 until 10
  aRange.foreach(println)

  (1 to 10).foreach(x => println("Hello"))


  // example 5: List


  val mylist1: List[String] = List("akash", "ASG", "diggibyte", "data")

  val mylist2 = List("C", "c#", "java", "scala", "php", "ruby")

  println(mylist1)
  for (mylist <- mylist2) {
    println(mylist2)
  }
  println(mylist1.head)
  println(mylist1.tail)
  println(mylist1.isEmpty)
  println("Reverse list:" + mylist1.reverse)

  // example 6:


  // Creating an Empty List.
  val emptylist: List[Nothing] = List()
  val emptylist1 = List()
  println(emptylist)
  println(emptylist1)


  // example 7


  val twolist: List[List[Int]] = List(List(1, 0, 0), List(0, 1, 0), List(0, 0, 1))
  println(twolist)


  val threelist: List[List[List[Int]]] = List(List(List(1, 0, 0, 0), List(0, 1, 0, 0), List(0, 0, 1, 0)))
  println(threelist)


  // example 8:

  // Repeats Scala three times.
  val programminglanguage = List.fill(3)("Scala")
  println("Programming Language : " + programminglanguage)

  val number = List.fill(8)(4)
  println("number : " + number)

  // example 9:

  var list = List(1, 8, 5, 6, 9, 58, 23, 15, 4)
  var list2 = List(88, 100)
  print("Elements: ")
  list.foreach((element: Int) => print(element + " ")) // Iterating using foreach loop
  print("\nElement at 2 index: " + list(2)) // Accessing element of 2 index
  var list3 = list ++ list2 // Merging two list
  print("\nElement after merging list and list2: ")
  list3.foreach((element: Int) => print(element + " "))
  var list4 = list3.sorted // Sorting list
  print("\nElement after sorting list3: ")
  list4.foreach((element: Int) => print(element + " "))
  var list5 = list3.reverse // Reversing list elements
  print("\nElements in reverse order of list5: ")
  list5.foreach((element: Int) => print(element + " "))

  // example10: array


  var days = Array("Sunday", "Monday", "Tuesday",
    "Wednesday", "Thursday", "Friday",
    "Saturday")


  for (m1 <- days) {
    println(m1)
  }

  // Accessing an array element
  println(days(1) )


// example 11

  val myarray = Array("C", "c#", "java", "scala", "php", "ruby")

  // Updating anelement in an array
  myarray(0)="spark"
  println("After updation array elements are: ")

  for ( m1 <- myarray )
  {
    println(m1 )
  }


// example 12

  var myarray1 = new Array[String](3)

  myarray1(0) = "c"
  myarray1(1) = "c#"
  myarray1(2) = "c++"
  println(myarray1)



// example 13:

  var arr1 = Array(1, 2, 3, 4)
  var arr2 = Array(5, 6, 7, 8)

  var arr3 = arr1 ++ arr2
  println(arr3)


// example 14:


val a = Array(45, 52, 61)
  // Appending 1 item
  val b = a :+ 27
  println("Array b ")
  for ( x <- b )
  {
    println( x )
  }
/*
  // Appending 2 item
  val c = b ++ Array(1, 2)
  println("Array c ")
  for ( x <- c )
  {
    println( x )
  }

  // Prepending 1 item
  val d = 3 +: c
  println("Array d ")
  for ( x <- d )
  {
    println( x )
  }

  // Prepending 2 item
  println("Array e ")
  val e = Array(10, 25) ++: d
  for ( x <- e )
  {
    println( x )
  }
*/
// example vector
  // Creating vector
  var vector1 = Vector(2, 3, 4, 5)

  // Using println and foreach function
  // To print elements of vector
  println(vector1)
  vector1.foreach((element:Int) => print(element+" "))
  var newVector = vector1 :+ 10
  var mergeVector2 = newVector ++ vector1
  var rev = vector1.reverse
  var st = vector1.sorted
  var newVector3  = vector1 :+ 6                            // Adding a new element into vector
  println(newVector)
  println(mergeVector2)
  println(rev)
  println(st)
  println(newVector3)


// example tuple

  var name = (15, "chandan", true)
  println(name(0))
// pattern matching
  var (c,d,e) = (15, "chandan", true)
  println(c)
  // print converted string
  println(name.toString() )


  val atuple = (2,"hello", "jvm")
  println(atuple(0))
  println(atuple.copy(2,"rock"))


  val phonebook = Map(("AKASH",123), "SCALA" -> 456)
//  val phonebook = Map(("AKASH",123), "SCALA" -> 456, ("akash", 1000))
  println(phonebook)


  // add a pairing
  val newPairing = "Mary" -> 678
  val newPhonebook = phonebook + newPairing
  println(newPhonebook)

  println(phonebook.map(pair => pair._1.toLowerCase -> pair._2))
  // filterKeys
  println(phonebook.view.filterKeys(x => x.startsWith("A")).toMap)
  // mapValues
  println(phonebook.view.mapValues(number => "0245-" + number).toMap)


  // conversions to other collections
  println(phonebook.toList)
  //  println(List(("Daniel", 555)).toMap)
  val names = List("Bob", "James", "Angela", "Mary", "Daniel", "Jim")
  println(names.groupBy(name => name.charAt(0)))
  println(names.groupBy(name => name.charAt(0) == 'J'))

// options in scala


// example 1 :

     val name_ = Map("akash" -> "data_engg",
     "diggibyte" -> "bigdata")

     val x = name_.get("akash")
     val y = name_.get("shubham")

     println(x)
     println(y)

// example 2:

  val name__ = Map("akash" -> "data_engg",
    "diggibyte" -> "bigdata")

  println(patrn(name__.get("akash")))
  println(patrn(name__.get("rahul")))

  def patrn(z: Option[String]) = z match
  {

    // for 'Some' class the key for
    // the given value is displayed
    case Some(s) => (s)

    // for 'None' class the below string
    // is displayed
    case None => ("key not found")
  }

// example 3:

  // Using Some class
  val some:Option[Int] = Some(15)

  // Using None class
  val none:Option[Int] = None

  // Applying getOrElse method
  val p4 = some.getOrElse(0)
  val p5 = none.getOrElse(17)

  // Displays the key in the
  // class Some
  println(p4)

  // Displays default value
  println(p5)

// example 4:

  val capitals = Map("France" -> "Paris", "Japan" -> "Tokyo")

  println("show(capitals.get( \"Japan\")) : " + show(capitals.get( "Japan")) )
  println("show(capitals.get( \"India\")) : " + show(capitals.get( "India")) )


  def show(x: Option[String]) = x match
    case Some(s) => s
    case None => "?"



}