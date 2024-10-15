class UndergraduateStudent(id: Int, name: String, course: String) : Student(id, name, course) {
    override fun toString(): String {
        return "Undergraduate Student - ${super.toString()}"
    }
}