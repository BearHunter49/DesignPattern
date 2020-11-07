package decorator

/**
 * Interface Delegation
 * 포획 가능한 포이즌 슬라임의 구현을 일반 포이즌 슬라임에 위임함!
 * 그에 따라 attack(), getAttackPower() 등을 구현할 필요가 없어짐. 똑같으니까.
 */
class PoisonCuteSlime(private val previousSlime: Slime) : Slime by PoisonSlime(previousSlime) {
    fun beFriends(){
        println("You became friend with Poison Slime! ")
    }
}