package eu.tutorials.kotlinbasics

fun main() {
//val shoppingList = listOf("Proccesor","RAM","Graphics Card","SSD")
    val shoppingList = mutableListOf(
        "Proccesor", "RAM",
        "Graphics Card RTX 3060", "SSD"
    )
    shoppingList.add("Cooling System")
    shoppingList.remove("Graphics Card RTX 3060")
    shoppingList.add("Graphics Card RTX 4090")


    shoppingList.removeAt(2)

    shoppingList.removeAt(1)

    shoppingList.add(2, "RAM")

    shoppingList[3] = "Graphics Card RX 7800XT"

    val hasRAM = shoppingList.contains("RAM")
    if (hasRAM) {
        println(
            "It has RAM"
        )
    } else {
        println("No RAM")
    }
    println(shoppingList.size)

    for (index in 0 until shoppingList.size) {
        println(" item ${shoppingList[index]} is at index $index")


    }

    println(shoppingList)

}