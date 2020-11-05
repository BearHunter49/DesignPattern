package abstract_factory.concrete.windows

import abstract_factory.abstract.Button
import abstract_factory.abstract.GuiFactory
import abstract_factory.abstract.TextArea

class WindowsGuiFactory : GuiFactory{
    override fun createButton(): Button {
        return WindowsButton()
    }

    override fun createTextArea(): TextArea {
        return WindowsTextArea()
    }

}