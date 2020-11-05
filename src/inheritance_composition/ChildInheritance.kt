package inheritance_composition

class ChildInheritance : Parent() {
//    override fun sum(x: Int, y: Int): String{
//        return (x + y).toString()
//    }
    // return 값이 달라도 안되고, 부모 sum이 바뀌면 덩달아 바뀜.

    override fun sum(x: Int, y: Int): Int {
        return x + y - 1
    }

}