package adapter

import adapter.new_math.MyNewMath
import adapter.origin_math.MyOriginMath
import adapter.origin_math.OriginMath

fun main() {
    val originMath: OriginMath = MyOriginMath()
    println(originMath.doTwoTime(10))
    println(originMath.doDivideTwo(10))

//    println(originMath.doTwoTime(10f))  << Error!

    // Adapter로 인해 Float 타입 연산 가능하게 해줌
    val newMath = MyNewMath(originMath)
    println(newMath.doTwoTime(10f))
    println(newMath.doDivideTwo(10f))
}