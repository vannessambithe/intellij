fun main(args: Array<String>) {
    for (i in 1.. 100){
        if(i % 3 == 0){
            println("$i fizzbuzz")
        }
        else if(i % 5 == 0){
            println("$i buzz")
        }
        else if(i % 15 == 0){
            println("$i fizz")
        }

    }
}
