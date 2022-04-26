package lectures.part3fp

import java.lang

object assignment extends App {



  def str(a:String): String
  =
  {
    a
  }
  {
    val x = s"dfs.core.windows.net/bronze/"

    // with s interpolator
    val devUrl = s"abfss:container@devstorage.${str(x)}"
    val testUrl = s"abfss:container@teststorage.${str(x)}"
    val accUrl = s"abfss:container@accstorage.${str(x)}"
    val prodUrl = s"abfss:container@prodstorage.${str(x)}"

    println(devUrl)
    println(testUrl)
    println(accUrl)
    println(prodUrl)
  }



/*
  // File handling program
  import java.io.File
  import java.io.PrintWriter

  // Creating object
  object Geeks
  {
    // Main method
    def main(args:Array[String])
    {
      // Creating a file
      val file_Object = new File("abc.txt" )

      // Passing reference of file to the printwriter
      val print_Writer = new PrintWriter(file_Object)

      def str(a:String): String
      =
      {
        a
      }
      {
        val x = s"dfs.core.windows.net/bronze/"

        // with s interpolator
        val devUrl = s"abfss:container@devstorage.${str(x)}"
      //  val testUrl = s"abfss:container@teststorage.${str(x)}"
      //  val accUrl = s"abfss:container@accstorage.${str(x)}"
      //  val prodUrl = s"abfss:container@prodstorage.${str(x)}"
        // Writing to the file
        print_Writer.write(devUrl)

      //  println(devUrl)
       // println(testUrl)
      //  println(accUrl)
      //  println(prodUrl)
      }


      // Closing printwriter
      print_Writer.close()
    }
  }

*/


}
