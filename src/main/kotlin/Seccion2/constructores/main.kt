package Seccion2.constructores

import java.time.LocalDateTime
import java.time.LocalTime
import java.time.Month

fun main() {

    val post = Post(
        name = "Tutorial de Kotlin",
        author = "Carlos Muñoz",
        date = LocalDateTime.of(2022, Month.JANUARY, 26, 14, 58)
    )

    print(post.publish())

    val post2 = Post(
        name = "Tutorial de Kotlin",
        author = "Carlos Muñoz",
        date = LocalDateTime.of(2022, Month.JANUARY, 26, 14, 58),
        content = "Contenido explicito para un post muy sexy",
        category = "Software"
    )
    println(post2.publish())

}