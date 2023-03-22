fun main(args: Array<String>) {
    print("Enter your marks")

    var marks: Int = readln()!!.toInt()

    if (marks > 80) {
        println("A")
        print("Congratulations")
    } else if (marks > 70) {

        println("A-")
        print("Well Done")

    } else if (marks > 60) {

        println("B")
        print("Can do better")

    } else {
        println("E")
        print("Repeat the exam")
    }
}