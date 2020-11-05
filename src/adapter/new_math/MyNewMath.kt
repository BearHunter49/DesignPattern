package adapter.new_math

import adapter.origin_math.OriginMath

class MyNewMath(private val originMath: OriginMath) : Adapter {
    override fun doTwoTime(value: Float): Float {
        return originMath.doTwoTime(value.toInt()).toFloat()
    }

    override fun doDivideTwo(value: Float): Float {
        return originMath.doDivideTwo(value.toInt()).toFloat()
    }

}
