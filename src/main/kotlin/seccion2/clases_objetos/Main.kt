package seccion2.clases_objetos

fun main(args: Array<String>) {

    //instanciando objetos
    val firstSong = Song(
        title = "SOLO",
         artist = "Jennie"
    )

    val secondSong = Song(
        title = "Whistle",
        artist = "Black Pink"
    )

    val thirdSong = Song(
        title = "No Roots",
        artist = "Alice Merton"
    )

    //Usando sus componentes
    secondSong.play()
    secondSong.stop()
    thirdSong.play()

}