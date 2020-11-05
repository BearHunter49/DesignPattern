package factory

import factory.creator.HpPotionCreator
import factory.creator.ItemFactory
import factory.creator.MpPotionCreator

fun main() {
    var creator: ItemFactory = HpPotionCreator()

    val myHpPotion = creator.create()
    myHpPotion.use()

    println()

    creator = MpPotionCreator()
    val myMpPotion = creator.create()
    myMpPotion.use()

}