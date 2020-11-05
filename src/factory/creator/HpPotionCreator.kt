package factory.creator

import factory.item.HpPotion
import factory.item.Item

class HpPotionCreator : ItemFactory() {
    override fun getItemInformation() {
        println("get HP Potion Information")
    }

    override fun enrollItemInformation() {
        println("enroll HP Potion Information")
    }

    override fun createItem(): Item {
        println("create HP Potion Information")
        return HpPotion()
    }
}