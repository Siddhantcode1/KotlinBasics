package eu.tutorials.kotlinbasics

fun main (){
    val fruitsList = mutableListOf("Banana","Apple","Kiwi","Orange","Grape")
    println(fruitsList)
    fruitsList.add("Melon")
    println(fruitsList)
    fruitsList.remove("Melon")
    println(fruitsList)
    if (fruitsList.contains("Grape")){
        println("You have grape in the list")
    }else {
        println("You dont have grape in your list")
    }

}