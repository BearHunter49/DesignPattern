package factory.item

class HpPotion : Item {
    override fun use() {
        println("Used HP Potion!")
    }

    override fun toString(): String {
        return "HP Potion"
    }
}