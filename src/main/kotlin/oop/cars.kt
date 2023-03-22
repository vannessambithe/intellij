package oop

class cars (driver:String, color:String, brand:String, price:Int){

//Initialize our class
    init {
        println("The driver is $driver")
        println("The color of the car is $color")
        println("The brand of the car is $brand")
        println("The price of the car is $price")
    }
}

fun main(args: Array<String>) {
    var car_one = cars("Vannessa", "pink", "Toyota", 1000000)
    var car_two = cars("Stella", "red", "BMW", 2500000)
    var car_three = cars("Sammy", "black","Ford", 1500000)
    var car_four = cars("Dennis", "blue", "RoyalCrown", 4000000)
    var car_five = cars("Jane", "grey", "VW", 3500000)

}