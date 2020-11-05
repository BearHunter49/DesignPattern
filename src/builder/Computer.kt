package builder

class Computer(var cpu: String, var ram: String, var storage: String) {
    fun getInformation(){
        println("$cpu, $ram, $storage")
    }

    class ComputerBuilder(){
        private var cpu: String = ""
        private var ram: String = ""
        private var storage: String = ""

        fun setCPU(mCPU: String): ComputerBuilder{
            this.cpu = mCPU
            return this
        }

        fun setRAM(mRAM: String): ComputerBuilder{
            this.ram = mRAM
            return this
        }

        fun setStorage(mStorage: String): ComputerBuilder{
            this.storage = mStorage
            return this
        }

        fun build(): Computer{
            return Computer(cpu, ram, storage)
        }
    }
}