package abstract_factory.concrete.mac

import abstract_factory.abstract.Button

class MacButton : Button {
    override fun click() {
        println("Mac Button!")
    }
}