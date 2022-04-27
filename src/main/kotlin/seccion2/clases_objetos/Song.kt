package seccion2.clases_objetos

class Song(private val title: String, private val artist: String) {

    private val artistUpper = artist.uppercase()

    init {
       println("clases_objetos.Song $title created")
    }

    fun play() {
        println("Playing $title - $artistUpper")
    }

    fun stop() {
        println("Stopping $title")
    }

}