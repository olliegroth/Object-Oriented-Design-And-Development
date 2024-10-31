class University {
    val students = mutableListOf<Student>()

    fun enrolStudent(student: Student) {
        students.add(student)
    }

    fun findStudentById(id: Int): Student? {
        return students.find { it.id == id }
    }

    fun findStudentsByName(name: String): MutableList<Student> {
        val matchingStudents = mutableListOf<Student>()
        for (student in students) {
            if (student.name == name) {
                matchingStudents.add(student)
            }
        }
        return matchingStudents
    }

    fun findPassingStudents(): MutableList<Student> {
        return students.filter {it.mark >= 40 }.toMutableList()
    }

    fun getStudentNames(): List<String> {
        return students.map { it.name }
    }
}