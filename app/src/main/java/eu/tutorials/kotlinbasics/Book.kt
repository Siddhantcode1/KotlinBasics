package eu.tutorials.kotlinbasics

class Book(val title : String = "Unknown", val author : String = "Anonymous", val yearPublished : Int = 2024) {
    init {
        bookDetails(title)

    }
    fun bookDetails(title: String){
        println(" $title is a book by $author in the year $yearPublished")
    }
}