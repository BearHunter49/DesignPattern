package decorator

class PoisonSlime(private val previousSlime: Slime) : Slime {

    override fun attack() {
        previousSlime.attack()
        println("...plus Poison Attack!")
    }

    override fun getAttackPower(): Int {
        return previousSlime.getAttackPower() + 30
    }
}