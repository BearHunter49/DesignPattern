package enumerated

sealed class SealedClass {
    data class C(val name: String, val age: Int): SealedClass()
    data class D(val email: String): SealedClass()
}