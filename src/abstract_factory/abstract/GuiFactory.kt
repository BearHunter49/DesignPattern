package abstract_factory.abstract

interface GuiFactory {
    fun createButton(): Button
    fun createTextArea(): TextArea
}