package template_method.server

class RpgGame : ConnectHelper() {
    val gameName = "RPG"

    override fun encode(id: String, pwd: String): String {
        println("$gameName Encoding...")
        // abstract encoding
        return id + pwd
    }

    override fun authentication(encoded: String) {
        println("$gameName Authentication...")
        // abstract authentication
    }

    override fun authorization(encoded: String): Int {
        println("$gameName Authorization...")
        // abstract authorization
        return 2
    }

    override fun connectServer(auth: Int) {
        println("$gameName connectServer... Auth: $auth")
    }
}