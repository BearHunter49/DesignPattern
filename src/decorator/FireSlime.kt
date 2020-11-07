package decorator

class FireSlime(private val previousSlime: Slime) : Slime {
    override fun attack() {
        previousSlime.attack()
        println("...plus Fire attack!")
    }

    override fun getAttackPower(): Int {
        return previousSlime.getAttackPower() + 70
    }
}