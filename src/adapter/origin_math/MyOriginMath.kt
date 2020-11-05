package adapter.origin_math

class MyOriginMath : OriginMath {
    override fun doTwoTime(value: Int): Int = value * 2
    override fun doDivideTwo(value: Int): Int = value / 2
}