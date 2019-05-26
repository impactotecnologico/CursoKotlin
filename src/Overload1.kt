fun main(args: Array<String>) {
    val p1 = Point(3, -8)
    val p2 = Point(2, 9)

    var sum = Point()
    sum = p1 + p2

    println("sum = (${sum.x}, ${sum.y})")
}

class Point(val x: Int = 0, val y: Int = 10) {

    // sobrecarga de la funcion "plus" u operador +
    operator fun plus(p: Point) : Point {
        return Point(x + p.x, y + p.y)
    }
}