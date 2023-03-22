package oop



class house(owner:String, bedroom:String, price:Int) {


//Initialize our class
    init {
        println("Owner is $owner")
        println("Number of bedrooms are $bedroom")
        println("Asking price is $price")
    }
}

fun main(args: Array<String>) {
    var house_one = house("Vannessa", "2", 750000)
}