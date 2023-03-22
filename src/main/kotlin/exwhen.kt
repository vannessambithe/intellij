fun main(args: Array<String>) {
    print("Dial 544#")


    var number: Int = readLine()!!.toInt()
    when (number) {
        1 -> println("Data Deals")
        2 -> println("Okoa Data")
        3 -> println("Daily Bundles")
        4 -> println("Weekly Bundles")
        5 -> println("Tunukiwa")

        else -> println("Sorry Option Not Available")


    }
}

