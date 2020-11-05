package builder

fun main() {
    val myComputer1 = Computer("i3", "4g", "128g ssd")
    myComputer1.getInformation()

    val myComputer2 = Computer.ComputerBuilder()
        .setCPU("i5")
        .setRAM("8g")
        .setStorage("256g ssd")
        .build()
    myComputer2.getInformation()
}