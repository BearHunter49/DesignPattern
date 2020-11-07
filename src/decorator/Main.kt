package decorator

fun main() {
    val basicSlime: Slime = BasicSlime()
    println("---Basic Slime---")
    basicSlime.attack()
    println(basicSlime.getAttackPower())
    println()

    val fireSlime: Slime = FireSlime(basicSlime)
    println("---Basic + Fire Slime---")
    fireSlime.attack()
    println(fireSlime.getAttackPower())
    println()

    val poisonSlime: Slime = PoisonSlime(basicSlime)
    println("---Basic + Poison Slime---")
    poisonSlime.attack()
    println(poisonSlime.getAttackPower())
    println()

    val awesomeSlime: Slime = PoisonSlime(fireSlime)
    println("---Basic + Fire + Poison Slime---")
    awesomeSlime.attack()
    println(awesomeSlime.getAttackPower())
    println()

    val poisonCuteSlime = PoisonCuteSlime(basicSlime)
    println("---Basic + Poison Cute Slime---")
    poisonCuteSlime.attack()
    poisonCuteSlime.beFriends()
    println(poisonCuteSlime.getAttackPower())

}