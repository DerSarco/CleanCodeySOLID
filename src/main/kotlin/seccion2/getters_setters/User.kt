package seccion2.getters_setters

import java.time.LocalDate

class User(email: String, password: String) {

    private val validGenders = listOf('M', 'F')
    private val dateNow = LocalDate.now()

    var isValid: Boolean = true

    var email: String = email
        set(value) {
            field = value.lowercase()
        }

    var password: String = password
        set(value) {
            field = if (value.length == 6) {
                value
            } else {
                isValid = false
                ""
            }
        }

    init {
        this.email = email
        this.password = password
    }

    var birthdate: LocalDate = dateNow
        set(value) {
            val age = dateNow.year - value.year
            field = if (age > 18) {
                value
            } else {
                isValid = false
                dateNow
            }
        }

    var gender = 'N'
        set(value) {
            field = if (validGenders.contains(value)) {
                value
            } else {
                isValid = false
                'N'
            }
        }


    constructor(
        email: String,
        password: String,
        birthdate: LocalDate,
        gender: Char
    ) : this(email, password) {
        this.birthdate = birthdate
        this.gender = gender
    }

}