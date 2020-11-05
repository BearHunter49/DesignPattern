package inheritance_composition

class ChildComposition {
    private val parent = Parent()

    fun printSum(x: Int, y: Int){
        println(parent.sum(x, y))
        println((x + y).toString())
    }
}