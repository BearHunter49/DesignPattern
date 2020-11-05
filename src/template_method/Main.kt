package template_method

import template_method.server.ConnectHelper
import template_method.server.FpsGame
import template_method.server.RpgGame

fun main() {
    var myGame: ConnectHelper = RpgGame()
    myGame.connect("BearHunter49", "0000")

    println()

    myGame = FpsGame()
    myGame.connect("BearHunter49", "0000")
}