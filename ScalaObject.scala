package lectures.part2oop

object ScalaObject extends App {

  // creating class level object
  object person {
    val n_eyes = 2
    def abc : Boolean = false

    // factory method
  //  def apply(mother: Person, father: Person): Person = new Person("Bobbie")
  }

  class person {

  }
// when we have same class name and both are in same
// domain it is called companions

  println(person.n_eyes)
  println(person.abc)

  // scala object = sington instances


  val mary =  person
  val john =   person
  println(mary == john)

  val mary1 = new person
  val john1 = new  person
  println(mary1 == john1)

  //val bobbie = Person(mary, john)

// practice questions on objects

 //1 // create a class:
  class practice {
    val name: String = "white"
    var weight : Int = 1
  }


  // accessing the class variable

  val accesscls = new practice
  println(accesscls.name)
  println(accesscls.weight)

  //We can modify the weight as it’s a mutable object:

  accesscls.weight = 2
  println(accesscls.weight)


  //2//

  class student {
    var id: Int = 0
    var name: String = null;
  }

    var s = new student
    println(s.id+" "+s.name)
    s.id = 1
    s.name = "hello"
    println(s.id+" "+s.name)

    //3// constructor

    class writer(firstname : String , surname: String , val  year: Int) {
      def fullname: String =firstname + " " + surname
    }


    class Novel (name: String , year : Int, author: writer){
      def authorage = year - author.year
      def writtenby(author: writer) =  author == this.author
    }

    val author = new writer("akash", "gortyal", 1996)
    val novel = new Novel("grate exceptations ", 2022, author)
    println(novel.authorage)
    println(novel.writtenby(author))
    println(author.fullname)

//4//
  class Person(name: String, age: Int) {
  def this(name: String) = this(name, 0)
  }
  class Adult(name: String, age: Int, idCard: String) extends Person(name)






}
