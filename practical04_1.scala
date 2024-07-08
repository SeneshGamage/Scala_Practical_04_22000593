object InventoryManagement {
  def displayInventory(itemNames: Array[String], itemQuantities: Array[Int]): Unit = {
    println("Inventory:")
    for (i <- itemNames.indices) {
      println(s"${itemNames(i)}: ${itemQuantities(i)}")
    }
  }

  def main(args: Array[String]): Unit = {
    // Example data (replace with your actual inventory data)
    val itemNames = Array("Apples", "Bananas", "Oranges")
    val itemQuantities = Array(10, 15, 20)


    displayInventory(itemNames, itemQuantities)
  }
}

