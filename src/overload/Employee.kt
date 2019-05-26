package overload

class Employee(val id: Long, val name: String)

class Company(private val employees: List<Employee>) {
    operator fun get(pos: Int) = employees[pos]

    operator fun get(id: Long) = employees.first { it.id == id }

}

fun main() {
    val company = Company(listOf(Employee(1235, "John"), Employee(2584, "Mike")))
    val mike = company[1];

    println(mike);
    println(mike.id);

    val mike2 = company[2584L]

    println(mike2);
}