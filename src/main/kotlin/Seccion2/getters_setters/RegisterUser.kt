package Seccion2.getters_setters

class RegisterUser {
    //yes -> User
    //no -> Null
    fun invoke(user: User): User?{
        return if(user.isValid) {
            user
        } else {
            null
        }
    }

}