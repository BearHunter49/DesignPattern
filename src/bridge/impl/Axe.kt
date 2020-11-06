package bridge.impl

import bridge.abst.Elemental
import bridge.abst.Weapon

class Axe(private val element: Elemental) : Weapon {
    override fun attack() {
        println("Axe Attack")
        element.elementalAttack()
    }

}