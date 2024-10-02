class Student(val id: Int, val name: String, val course: String, var mark: Int) {

    override fun toString() : String {
        return "ID: $id Name: $name Course: $course Mark: $mark"
    }
}