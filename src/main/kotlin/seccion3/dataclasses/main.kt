package seccion3.dataclasses

fun main() {

    val firstSong = Song(
        "SOLO",
        "Jennie"
    )

    val secondSong = Song(
        "SOLO",
        "Jennie"
    )

    println(
        "Are Classes Song equals: ${firstSong == secondSong}"
    )

    println()

    val firstDataClassSong = DataClassSong(
        "SOLO",
        "Jennie"
    )

    val secondDataClassSong = DataClassSong(
        "SOLO",
        "Jennie"
    )

    println(
        "Are Data Classes Song equals: ${firstDataClassSong == secondDataClassSong}"
    )

}