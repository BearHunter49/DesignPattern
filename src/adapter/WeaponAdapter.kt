package adapter

class WeaponAdapter(private val alternativeWeapon: Rod) : Weapon {
    override fun attack() {
        alternativeWeapon.brandish()
    }
}
