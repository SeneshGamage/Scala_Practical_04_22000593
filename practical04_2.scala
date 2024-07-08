import scala.io.StdIn._

object RestockedInventory {
  // Example inventory data (replace with your actual data)
  val itemNames: Array[String] = Array("Apples", "Bananas", "Oranges")
  val itemQuantities: Array[Int] = Array(10, 15, 20)

  def restockItem(): Unit = {
    val itemName = readLine("Enter the item name: ")
    print("Enter the newly adding quantity: ")
    val quantityToAdd = readInt()

    val itemIndex = itemNames.indexOf(itemName)
    if (itemIndex != -1) {
      // Item exists; update quantity
      itemQuantities(itemIndex) += quantityToAdd
      println(s"Restocked $itemName by $quantityToAdd. New quantity: ${itemQuantities(itemIndex)}")
    } else {
      // Item does not exist
      println(s"$itemName does not exist in the inventory.")
    }
  }

  def displayInventory(): Unit = {
    println("Current inventory:")
    itemNames.zip(itemQuantities).foreach { case (item, quantity) =>
      println(s"$item: $quantity")
    }
  }
  def main(args: Array[String]): Unit = {
    restockItem()
    displayInventory()
  }
}
