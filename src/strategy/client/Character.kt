package strategy.client

import strategy.weapons.Fist
import strategy.weapons.Weapon

class Character(private var weapon: Weapon = Fist()) {

    fun equip(weapon: Weapon){
        this.weapon = weapon
    }

    fun attack(){
        weapon.attack()
    }
}