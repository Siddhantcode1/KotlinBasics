package eu.tutorials.kotlinbasics

fun main (){
    println("Please enter a number:")
    var inputString = readln()
    var inputNumber = inputString.toInt()
    val multiplier = 5
    var result = inputNumber*multiplier
    println("The result of the operation is : $result")

}