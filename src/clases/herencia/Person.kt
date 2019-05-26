package clases.herencia

open class Person(var name: String, var age: Int, var college: String?) {
    open fun isEligibleToVote(): Boolean {
        // If age is greater or equal to 18
        // return true
        return age >= 18
    }
}

class Employee(name: String, age: Int, college: String?, var company: String) : Person(name, age, college) {
    override fun isEligibleToVote(): Boolean {
        // Always return true
        return true
    }
}