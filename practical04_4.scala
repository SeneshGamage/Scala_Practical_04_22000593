import scala.io.StdIn._

object PatternMatching {

  def main(args: Array[String]): Unit = {
    val input = {
        println("Please provide an integer input:")
        readInt()
      }
    input match {
      case x if x <= 0 => println("Negative/Zero is input")
      case x if x % 2 == 0 => println("Even number is given")
      case _ => println("Odd number is given")
    }
  }
}
