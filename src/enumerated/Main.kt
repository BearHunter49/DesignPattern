package enumerated

fun main() {
    // enum class
    val enumClass: EnumClass = EnumClass.A
    when (enumClass){
        EnumClass.A -> println("A")
        EnumClass.B -> println("B")
    }

    // sealed class
    val sealedClass: SealedClass = SealedClass.C("Bear", 26)

    when (sealedClass){
        is SealedClass.C -> println("$sealedClass.name, ${sealedClass.age}")
        is SealedClass.D -> println("$sealedClass.email")
    }

}


