package abstract_factory.concrete.mac

import abstract_factory.abstract.TextArea

class MacTextArea : TextArea {
    override fun getText() {
        println("Mac Text!")
    }
}