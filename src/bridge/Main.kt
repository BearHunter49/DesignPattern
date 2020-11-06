package bridge

import bridge.abst.Weapon
import bridge.impl.Axe
import bridge.impl.Fire
import bridge.impl.Ice
import bridge.impl.Sword

fun main() {
    val fireSword: Weapon = Sword(Fire())
    fireSword.attack()

    val iceAxe: Weapon = Axe(Ice())
    iceAxe.attack()
}