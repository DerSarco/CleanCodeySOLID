package ejercicio1

import ejercicio1.domain.model.fab.properties.Label
import ejercicio1.domain.model.fab.regular.properties.Container
import ejercicio1.domain.model.fab.regular.properties.Icon
import ejercicio1.domain.model.fab.types.ExtendedFAB
import ejercicio1.domain.model.fab.types.MiniFAB
import ejercicio1.domain.model.fab.types.RegularFAB


fun main() {

    val container = Container()
    val icon = Icon(icon = "IconoSexy.png")
    val label = Label(textLabel = "A cool text goes here")

    val regularFAB = RegularFAB(container, icon)
    regularFAB.setOnClickListener()

    println()
    container.color = "Black"
    val miniFAB = MiniFAB(container, icon)
    miniFAB.setOnClickListener()

    println()

    container.color
    val extendedFAB = ExtendedFAB(container = container, label = label)
    extendedFAB.setOnClickListener()
    extendedFAB.showIcon()


}