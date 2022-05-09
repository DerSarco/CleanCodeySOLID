package ejercicio1.domain.model.fab.types

import ejercicio1.domain.model.fab.ExtendedFloatingActionButton
import ejercicio1.domain.model.fab.properties.Label
import ejercicio1.domain.model.fab.regular.properties.Container
import ejercicio1.domain.model.fab.regular.properties.Icon

class ExtendedFAB(private val container: Container, val icon: Icon, val label: Label) :
    ExtendedFloatingActionButton(container, icon, label) {
    override fun setOnClickListener() {
        println("This is an Extended FAB")
        super.setOnClickListener()
    }

}