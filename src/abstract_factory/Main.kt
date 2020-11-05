package abstract_factory

import abstract_factory.concrete.FactoryInstance

fun main() {
    val myFactory = FactoryInstance.getGuiFactory()
    val myButton = myFactory.createButton()
    val myTextArea = myFactory.createTextArea()

    myButton.click()
    myTextArea.getText()
}