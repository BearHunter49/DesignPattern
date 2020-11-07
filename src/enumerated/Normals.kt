package enumerated

open class Normals {
    val mName = "Normals"

    inner class NormalClassA : Normals() {
        val name = "A"
    }

    class NormalClassB : Normals() {
        val name = "B"
//        val name = mName
    }

    inner class NormalClassC : Normals() {
        val name = mName
    }


}
