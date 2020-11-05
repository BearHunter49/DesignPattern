package singleton

fun main() {
    println(SingleTonClass.value)
    SingleTonClass.foo()

    println(SingleTonClass)
    println(SingleTonClass)
}