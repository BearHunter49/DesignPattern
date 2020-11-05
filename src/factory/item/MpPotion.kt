package factory.item

class MpPotion : Item {
    override fun use() {
        println("Used MP Potion!")
    }

    override fun toString(): String {
        return "MP Potion"
    }
}