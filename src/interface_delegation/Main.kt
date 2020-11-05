package interface_delegation

fun main() {
    val fish = GoodFish()
    fish.whatColor()

    val fish2 = AwesomeFish(BlueColor)
    fish2.whatColor()
}