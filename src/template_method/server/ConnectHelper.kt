package template_method.server

abstract class ConnectHelper {
    protected abstract fun encode(id: String, pwd: String): String
    protected abstract fun authentication(encoded: String)
    protected abstract fun authorization(encoded: String): Int
    protected abstract fun connectServer(auth: Int)

    fun connect(id: String, pwd: String){
        val encoded = encode(id, pwd)
        authentication(encoded)
        val auth = authorization(encoded)
        connectServer(auth)
    }
}