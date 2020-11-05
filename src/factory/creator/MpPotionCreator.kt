package factory.creator

import factory.item.Item
import factory.item.MpPotion

class MpPotionCreator : ItemFactory() {
    override fun getItemInformation() {
        println("get MP Potion Information")
    }

    override fun enrollItemInformation() {
        println("enroll MP Potion Information")
    }

    override fun createItem(): Item {
        println("create MP Potion Information")
        return MpPotion()
    }
}