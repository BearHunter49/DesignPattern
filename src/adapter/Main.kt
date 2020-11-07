package adapter

fun main() {
    val sword: Weapon = Sword()
    sword.attack()

    val tempWeapon: Weapon = WeaponAdapter(Rod())
    tempWeapon.attack()

}