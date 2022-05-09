package ejercicio1.domain.model.fab

import ejercicio1.domain.model.fab.properties.Label
import ejercicio1.domain.model.fab.regular.properties.Container
import ejercicio1.domain.model.fab.regular.properties.Icon

abstract class ExtendedFloatingActionButton(
    private val container: Container,
    private var icon: Icon?,
    private val label: Label
) :
    FloatingActionButton(container, icon) {
    fun showLabel() {
        println(label.textLabel)
    }

    fun showIcon() {
        println("Icon props")
        println(icon?.icon)
        println(icon?.color)
    }
}
