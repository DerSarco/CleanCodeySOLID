package seccion2.getters_setters

import java.time.LocalDate
import java.time.Month

fun main() {
    // User
    // - email
    // - password
    // - birthdate
    // - gender (M - F)

    // register(user)

    val user = User("ANAHI@GMAIL.COM", "abc1234")
    val userRegistered = RegisterUser().invoke(user)

    if (userRegistered != null) {
        println("User Registered ${userRegistered.email}")
        println("User Registered ${userRegistered.password}")
    } else {
        println("User not registered, not valid")
    }

    println()


    val carlosUser = User(
        email = "CARLOS@GMAIL.COM",
        password = "abc123",
        birthdate = LocalDate.of(1993, Month.DECEMBER, 22),
        gender = 'M'
    )
    val carlosRegister = RegisterUser().invoke(carlosUser)
    if (carlosRegister != null) {
        println("User Registered ${carlosRegister.email}")
        println("User Registered ${carlosRegister.password}")
        println("User Registered ${carlosRegister.birthdate}")
        println("User Registered ${carlosRegister.gender}")
    } else {
        println("User not registered, not valid")
    }


}