package ejercicio1.domain.model.fab

import ejercicio1.domain.model.fab.properties.Label
import ejercicio1.domain.model.fab.regular.properties.Container
import ejercicio1.domain.model.fab.regular.properties.Icon

abstract class ExtendedFloatingActionButton:
    FloatingActionButton() {
    abstract override val container: Container
    abstract override val icon: Icon?
    abstract val label: Label

    fun showLabel() {
        println(label.textLabel)
    }

    fun showIcon() {
        println("Icon props")
        println(icon?.icon)
        println(icon?.color)
    }
}
