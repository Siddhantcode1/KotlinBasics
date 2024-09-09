package eu.tutorials.kotlinbasics

data class CoffeeDetails(val sugarAnount: Int, val name: String,val size : String, val creamAmount : Int)


fun main() {
    val coffeeForSidd = CoffeeDetails(0,"Sidd","med",0)
makeCoffee(coffeeForSidd)
}

fun askCoffeeDetails() {
    println("Whos is this coffee for?")
    val name = readln()
    println("How Many cibes of sugar do you want?")
    val sugarAnount = readln()
    val sugarAnountInt = sugarAnount.toInt()
    //makeCoffee(sugarAnountInt, name)
}

// Define Function
fun makeCoffee(coffeeDetails: CoffeeDetails) {

    if (coffeeDetails.sugarAnount == 1) {
        println("Coffee with 1 cube of sugar for ${coffeeDetails.name}+ and cream :"+
        "${coffeeDetails.creamAmount}")
    } else if (coffeeDetails.sugarAnount == 0) {
        println("Coffee with no cubes of sugar for ${coffeeDetails.name}")
    } else {
        println("Coffee with ${coffeeDetails.sugarAnount} cubes of sugar for ${coffeeDetails.name}")
    }
}