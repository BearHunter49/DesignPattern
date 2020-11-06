package bridge.impl

import bridge.abst.Elemental

class Fire : Elemental {
    override fun elementalAttack() {
        println("with Fire!")
    }
}