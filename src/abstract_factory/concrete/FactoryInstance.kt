package abstract_factory.concrete

import abstract_factory.abstract.GuiFactory
import abstract_factory.concrete.mac.MacGuiFactory
import abstract_factory.concrete.windows.WindowsGuiFactory

object FactoryInstance {
    fun getGuiFactory(): GuiFactory{
        when (getOS()){
            0 -> return MacGuiFactory()
            1 -> return WindowsGuiFactory()
            else -> return WindowsGuiFactory()
        }
    }

    private fun getOS(): Int {
        // get OS Information
        return 1
    }
}