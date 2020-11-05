package abstract_factory.concrete.windows

import abstract_factory.abstract.TextArea

class WindowsTextArea : TextArea {
    override fun getText() {
        println("Windows Text!")
    }
}