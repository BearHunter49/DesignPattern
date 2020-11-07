package composite

class Directory(override val name: String) : Component() {
    private val children = arrayListOf<Component>()

    fun addChild(component: Component){
        children.add(component)
    }

    fun showChildren(){
        println("I'm a $name")

        for (child in children){
            when (child){
                is Directory -> {
                    child.showChildren()
                }
                is File -> println(child.name)
            }
        }

    }
}