class MastersStudent(id: Int, name: String, course: String) : Student(id, name, course) {
    override fun toString(): String {
        return "Masters Student - ${super.toString()}"
    }
}