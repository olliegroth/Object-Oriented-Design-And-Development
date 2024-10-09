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

//    val jed = Student(1, "Jed", "D&TS")
//    println("Enter the mark for ${jed.name}: ")
//    val inputMark = readln().toDouble()
//    jed.mark = inputMark
//
//    println("Mark: ${jed.mark}")
//    println("Grade: ${jed.getGrade()}")
//    println("Passed: ${jed.didPass()}")

    val students = mutableListOf<Student>()

    var moreStudents = true
    var idCounter = 0

    while (moreStudents) {
        idCounter++
        println("Enter the name of student $idCounter: ")
        val name = readln()
        println("Enter the course for $name: ")
        val course = readln()

        val student = Student(idCounter, name, course)

        println("Enter the mark for $name: ")
        val inputMark = readln().toDouble()
        student.mark = inputMark

        students.add(student)

        println("Do you want to enter another student? (y/n)")
        val response = readln()
        if (response.lowercase() != "y") {
            moreStudents = false
        }
    }
    println("\nStudent List:")
    for (student in students) {
        println("ID: ${student.id}, Name: ${student.name}, Course: ${student.course}")
        println("Mark: ${student.mark}, Grade: ${student.getGrade()}, Passed: ${student.didPass()}")
        println("--------------------------------")
    }
}