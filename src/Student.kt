class Student(val id: Int, val name: String, val course: String) {

    var mark = -1.0
        set(newMark) {
            if(newMark in 0.0..100.0) {
                field = newMark
            }
        }

    override fun toString() : String {
        return "ID: $id Name: $name Course: $course Mark: $mark"
    }

    fun getGrade() : String {
        return if (mark >= 70) {
            ("First")
        } else if (mark >= 60) {
            ("2/1")
        } else if (mark >= 50) {
            ("2/2")
        } else if (mark >= 40) {
            ("Third")
        } else if (mark >= 0) {
            ("Fail")
        } else {
            ("Error: Mark is invalid")
        }
    }

    fun didPass() : Boolean {
        return mark >= 40
    }
}