package interface_delegation

class AwesomeFish(mFishColor: FishColor = GoldColor) : FishColor by mFishColor {
    fun whatColor(){
        println(color)
    }
}