package interface_delegation

class GoodFish : FishColor by GoldColor {

    fun whatColor(){
        println(color)
    }
}