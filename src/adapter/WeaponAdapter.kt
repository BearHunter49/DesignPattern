package adapter

class WeaponAdapter(private val alternativeWeapon: Ball) : Weapon {
    override fun attack() {
        alternativeWeapon.throwing()
    }
}
