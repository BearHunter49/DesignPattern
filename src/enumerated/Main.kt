package enumerated

fun main() {
    // normal class
    val normals: Normals = Normals().NormalClassA()  // inner class (non-static nested class)
//    val normalA2 = Normals.NormalClassA()  안됨

//    val normalB = Normals.NormalClassB()  // static nested class
//    val normalC = Normals().NormalClassC()
    checkNormalClass(normals)



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

/**
 * return 값이 있을 경우 when은 안전하게 모든걸 예측 가능해야 함.
 * return 값 없으면 else 없어도 동작 됨(예측 할 필요가 없어서?)
 */
fun checkNormalClass(normals: Normals): String =
    when (normals){
        is Normals.NormalClassA -> normals.name
        is Normals.NormalClassB -> normals.name
        is Normals.NormalClassC -> normals.name
        else -> "Else"
    }


