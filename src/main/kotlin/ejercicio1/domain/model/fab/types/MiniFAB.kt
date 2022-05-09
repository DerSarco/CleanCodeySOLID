package ejercicio1.domain.model.fab.types

import ejercicio1.domain.model.fab.FloatingActionButton
import ejercicio1.domain.model.fab.regular.properties.Container
import ejercicio1.domain.model.fab.regular.properties.Icon

class MiniFAB(container: Container, icon: Icon) : FloatingActionButton(container, icon) {
    override fun setOnClickListener() {
        println("this is a Mini FAB")
        super.setOnClickListener()
    }
}