package strategy.client

import strategy.weapons.Weapon

class Character {

    private var weapon: Weapon? = null

    fun equip(weapon: Weapon){
        this.weapon = weapon
    }

    fun attack(){
        weapon?.attack() ?: println("Fist Attack!")
    }
}