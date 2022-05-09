package ejercicio1.domain.model.fab

import ejercicio1.domain.model.fab.properties.Actions
import ejercicio1.domain.model.fab.regular.properties.Container
import ejercicio1.domain.model.fab.regular.properties.Icon

abstract class FloatingActionButton: Actions {

    abstract val container: Container
    abstract val icon: Icon?

    override fun setOnClickListener() {
        println("Execution ${javaClass.name}: Container Color: ${container.color} - Container Elevation: ${container.elevation}")
    }
}