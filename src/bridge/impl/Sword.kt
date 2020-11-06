package bridge.impl

import bridge.abst.Elemental
import bridge.abst.Weapon

class Sword(private val element: Elemental) : Weapon {

    override fun attack() {
        println("Sword Attack")
        element.elementalAttack()
    }


}