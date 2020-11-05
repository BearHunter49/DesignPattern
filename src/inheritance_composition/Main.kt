package inheritance_composition

fun main() {
    val inheritance = ChildInheritance()
    val composition = ChildComposition()

    println(inheritance.sum(3, 5))
    println()
    composition.printSum(3, 5)
}