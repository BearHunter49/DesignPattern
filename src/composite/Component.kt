package composite

abstract class Component {
    abstract val name: String

    fun showName(){
        println("$this.name")
    }
}