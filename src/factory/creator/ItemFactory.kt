package factory.creator

import factory.item.Item

abstract class ItemFactory {
    protected abstract fun getItemInformation()
    protected abstract fun enrollItemInformation()
    protected abstract fun createItem(): Item

    fun create(): Item{
        getItemInformation()
        enrollItemInformation()
        return createItem()
    }
}