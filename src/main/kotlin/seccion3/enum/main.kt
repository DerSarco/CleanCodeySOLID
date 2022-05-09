package seccion3.enum

import seccion3.enum.constructor.Color
import seccion3.enum.functions.ErrorType


fun main() {
    val connectionType = ConnectionType.WIFI
    println(connectionType)

    connectionType.let {

    }

    println()

    val whiteHex = Color.WHITE.hexa
    println(whiteHex)

    val retries = ErrorType.NOT_LOGGED_IN_ERROR.getRetryIntents()
    println(retries)

}