fun main(args: Array<String>) {
    val weight = 80.0 // weight in kg
    val height = 160.0 // height in cm
    val heightinmetres = height /100.0

    val bmi = weight / (heightinmetres*heightinmetres)
    println("BMI: %.2f kg/m^2".format(bmi))
}