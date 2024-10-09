fun main () {
//    val ozzy = Cat("Ozzy", 3, 10)
//    val margo = Cat("Margo", 1, 5)
//
//    ozzy.walk(2)
//    margo.walk(10)
//    println(ozzy.toString())
//    println(margo.toString())
//
//    for (i in 1..5) {
//        println(if (ozzy.walk(1)) "Walk successful" else "Walk failed")
//    }
//    println(ozzy.toString())
//
//    for (i in 1..10) {
//        println(if (ozzy.eat(2)) "Eat successful" else "Eat failed")
//    }
//    println(ozzy.toString())

    val jed = Student(1, "Jed", "D&TS")
    println("Enter the mark for ${jed.name}: ")
    val inputMark = readln().toDouble()
    jed.mark = inputMark

    println("Mark: ${jed.mark}")
    println("Grade: ${jed.getGrade()}")
    println("Passed: ${jed.didPass()}")
}