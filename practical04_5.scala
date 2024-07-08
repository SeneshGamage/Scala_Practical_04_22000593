object StringFormatter {

  // Function to convert a string to uppercase
  def toUpper(name: String): String = {
    name.toUpperCase
  }

  // Function to convert a string to lowercase
  def toLower(name: String): String = {
    name.toLowerCase
  }

  // Function to capitalize first two letters
  def capitalizeFirstTwo(name: String): String = {
    name.take(2).toUpperCase + name.drop(2)
  }

  // Function to capitalize first and last letters
  def capitalizeFirstLast(name: String): String = {
    name.head.toString.toUpperCase + name.drop(1).dropRight(1) + name.last.toString.toUpperCase
  }

  // Function to format a name using a provided formatting function
  def formatNames(name: String, formatter: String => String): String = {
    formatter(name)
  }

  def main(args: Array[String]): Unit = {
    val names = List("Benny", "Niroshan", "Saman", "Kumara")

    // Apply formatting functions to each name
    val formattedNames = names.map { name =>
      name match {
        case "Benny" => name.toUpperCase  // Directly convert Benny to uppercase
        case "Niroshan" => formatNames(name, capitalizeFirstTwo) // Capitalize first two letters
        case "Saman" => formatNames(name, toLower)  // Convert Saman to lowercase
        case "Kumara" => formatNames(name, capitalizeFirstLast) // Capitalize first and last letter
      }
    }

    // Print the formatted names
    println(formattedNames.mkString(" "))
  }
}
