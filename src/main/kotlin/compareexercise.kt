fun main(args: Array<String>){
    print("Enter your age")

    var age:Int = readLine()!!.toInt()

  if (age >= 18){
      print("welcome to the club")
  }
    else{
        print("Sorry we cannot admit underage")
  }
}