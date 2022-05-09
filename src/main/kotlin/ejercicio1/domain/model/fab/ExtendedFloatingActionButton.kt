package ejercicio1.domain.model.fab

import ejercicio1.domain.model.fab.properties.Label
import ejercicio1.domain.model.fab.regular.properties.Container
import ejercicio1.domain.model.fab.regular.properties.Icon

open class ExtendedFloatingActionButton(container: Container, icon: Icon, label: Label) :
    FloatingActionButton(container, icon)
