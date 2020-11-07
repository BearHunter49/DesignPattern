package decorator

open class BasicSlime : Slime {

    override fun attack() {
        println("Basic Attack!")
    }

    override fun getAttackPower(): Int {
        return 50
    }


}