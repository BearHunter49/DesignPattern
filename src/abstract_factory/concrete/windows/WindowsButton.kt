package abstract_factory.concrete.windows

import abstract_factory.abstract.Button

class WindowsButton : Button {
    override fun click() {
        println("Windows Button!")
    }
}