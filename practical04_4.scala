import scala.io.StdIn._

object PatternMatching {

  def main(args: Array[String]): Unit = {
    val input = try {
      // Attempt to get input from command line arguments
      if (args.length > 0) {
        args(0).toInt
      } else {
        // If no arguments provided, prompt the user for input
        println("Please provide an integer input:")
        readInt()
      }
    } catch {
      case e: NumberFormatException =>
        println("Invalid input. Please enter an integer.")
        sys.exit(1) // Exit with an error code if input is invalid
    }

    // Concise and readable pattern matching with clear formatting
    input match {
      case x if x <= 0 => println("Negative/Zero is input")
      case x if x % 2 == 0 => println("Even number is given")
      case _ => println("Odd number is given")
    }
  }
}
