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

    // Week 3

//    val students = mutableListOf<Student>()
//
//    var moreStudents = true
//    var idCounter = 0
//
//    while (moreStudents) {
//        idCounter++
//        println("Enter the name of student $idCounter: ")
//        val name = readln()
//        println("Enter the course for $name: ")
//        val course = readln()
//
//        val student = Student(idCounter, name, course)
//
//        println("Enter the mark for $name: ")
//        val inputMark = readln().toDouble()
//        student.mark = inputMark
//
//        students.add(student)
//
//        println("Do you want to enter another student? (y/n)")
//        val response = readln()
//        if (response.lowercase() != "y") {
//            moreStudents = false
//        }
//    }
//    println("\nStudent List:")
//    for (student in students) {
//        println("ID: ${student.id}, Name: ${student.name}, Course: ${student.course}")
//        println("Mark: ${student.mark}, Grade: ${student.getGrade()}, Passed: ${student.didPass()}")
//        println("--------------------------------")
//    }
//
//    val university = University()
//    var choice: String
//
//    do {
//        println("Menu:")
//        println("1. Add a student")
//        println("2. Search for student by ID")
//        println("3. Search for students by name")
//        println("4. Quit")
//        print("Enter your choice: ")
//        choice = readln()
//
//        when (choice) {
//            "1" -> {
//                println("Enter student type (undergraduate/masters): ")
//                val type = readln().lowercase()
//                println("Enter student name: ")
//                val name = readln()
//                println("Enter student course: ")
//                val course = readln()
//                println("Enter student mark: ")
//                val mark = readln().toDouble()
//
//                val student = when (type) {
//                    "undergraduate" -> UndergraduateStudent(university.students.size + 1, name, course)
//                    "masters" -> MastersStudent(university.students.size + 1, name, course)
//                    else -> {
//                        println("Invalid student type.")
//                        continue
//                    }
//                }
//                student.mark = mark
//                university.enrolStudent(student)
//                println("Student added successfully.")
//            }
//            "2" -> {
//                println("Enter student ID: ")
//                val id = readln().toInt()
//                val student = university.findStudentById(id)
//                if (student != null) {
//                    println("Student found: $student")
//                } else {
//                    println("Student not found.")
//                }
//            }
//            "3" -> {
//                println("Enter student name: ")
//                val name = readln()
//                val listOfStudents = university.findStudentsByName(name)
//                if (listOfStudents.isNotEmpty()) {
//                    println("Students found:")
//                    for (student in listOfStudents) {
//                        println(student)
//                    }
//                } else {
//                    println("No students found with that name.")
//                }
//            }
//            "4" -> {
//                println("Exiting...")
//            }
//            else -> {
//                println("Invalid choice. Please try again.")
//            }
//        }
//    } while (choice != "4")

    // Week 6

    val keyboardInputs = mutableListOf<String>()

    for (i in 1..5) {
        print("Enter string $i: ")
        val input = readln()
        keyboardInputs.add(input)
    }

    val filteredKeyboardInputs = keyboardInputs.filter {it.isNotBlank()}

    print("Filtered list: $filteredKeyboardInputs")

}