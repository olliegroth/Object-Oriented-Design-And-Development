class Student(val id: Int, val name: String, val course: String, markIn: Double) {

    var mark = 0.0
        set(newMark) {
            if(newMark in 0.0..100.0) {
                field = newMark
            }
        }

    init {
        mark = markIn
    }

    override fun toString() : String {
        return "ID: $id Name: $name Course: $course Mark: $mark"
    }
}