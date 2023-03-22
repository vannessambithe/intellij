fun main(args: Array<String>) {
    print("Dial *544#")

    var number: Int = readLine()!!.toInt()

    if (number == 1) {
        println("sh20 for 1hr")
    }
    if (number == 2){
        println("Data Deals")
    }
    if (number == 3){
        println("Daily BUNDLES")
    }
    if (number == 4){
        println("Weekly bundles")
    }
    else {
        println("Invalid Choice")
    }
}