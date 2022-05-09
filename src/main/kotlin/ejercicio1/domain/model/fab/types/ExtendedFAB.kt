package ejercicio1.domain.model.fab.types

import ejercicio1.domain.model.fab.ExtendedFloatingActionButton
import ejercicio1.domain.model.fab.properties.Label
import ejercicio1.domain.model.fab.regular.properties.Container
import ejercicio1.domain.model.fab.regular.properties.Icon


/*
 *Icon could be optional, for that, the default value of icon is null
 **/

class ExtendedFAB(override val container: Container, override val icon: Icon? = Icon(), override val label: Label) :
    ExtendedFloatingActionButton() {
    override fun setOnClickListener() {
        println("This is an Extended FAB")
        super.setOnClickListener()
    }

}