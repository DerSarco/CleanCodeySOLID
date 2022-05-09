package ejercicio1.domain.model.fab

import ejercicio1.domain.model.fab.properties.Actions
import ejercicio1.domain.model.fab.regular.properties.Container
import ejercicio1.domain.model.fab.regular.properties.Icon

abstract class FloatingActionButton(
    private val container: Container,
    private val icon: Icon?
) : Actions {
    override fun setOnClickListener() {
        println("Execution ${javaClass.name}: Container Color: ${container.color} - Container Elevation: ${container.elevation}")
    }
}