package strategy

import strategy.client.Character
import strategy.weapons.Axe
import strategy.weapons.Sword

fun main() {
    val me = Character()
    me.attack()

    me.equip(Sword())
    me.attack()

    me.equip(Axe())
    me.attack()
}