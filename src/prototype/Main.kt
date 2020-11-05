package prototype

fun main() {
    val circle = Circle(2, 2, 3)
    circle.getInformation()

    val newCircle = circle.copy(5, 5, 2)
    newCircle.getInformation()

}