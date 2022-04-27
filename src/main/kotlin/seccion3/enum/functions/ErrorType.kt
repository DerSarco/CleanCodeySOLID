package seccion3.enum.functions

enum class ErrorType(
    val message: String
) {
    UNKNOWN_ERROR("Unknown Error") {
        override val userMessage: String
            get() = "Unexpected error ocurred"

        override fun getCodeError(): String = "UE00"
        override fun getRetryIntents(): Int = 2
    },
    CONNECTIVITY_ERROR("Connectivity error") {
        override val userMessage: String = "Failure request"
        override fun getCodeError(): String = "CE003"
        override fun getRetryIntents(): Int = 3
    },
    NOT_LOGGED_IN_ERROR("Not logged in error") {
        override val userMessage: String = "Not authorized, Not logged in"
        override fun getCodeError(): String = "LE002"
        override fun getRetryIntents(): Int = 6
    };

    abstract val userMessage: String
    abstract fun getCodeError(): String
    open fun getRetryIntents(): Int = 1
    fun otraFuncion(): Int = 0
}