class Cat (private val name: String, private var age: Int, weightIn: Int) {

    var weight = 0
        set(newWeight) {
            if(newWeight >= 5) {
                field = newWeight
            }
        }

    init {
        weight = weightIn
    }

    fun walk(distance: Int) : Boolean {
        if(weight - distance >= 5) {
            weight -= distance
            return true
        }
        return false
    }

    fun eat(food: Int) : Boolean {
        if(weight + food <= 20) {
            weight += food
            return true
        }
        return false
    }

    override fun toString() : String {
        return "Name: $name | Age: $age | Weight: $weight"
    }
}