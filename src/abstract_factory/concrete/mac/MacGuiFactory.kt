package abstract_factory.concrete.mac

import abstract_factory.abstract.Button
import abstract_factory.abstract.GuiFactory
import abstract_factory.abstract.TextArea

class MacGuiFactory : GuiFactory{
    override fun createButton(): Button {
        return MacButton()
    }

    override fun createTextArea(): TextArea {
        return MacTextArea()
    }

}