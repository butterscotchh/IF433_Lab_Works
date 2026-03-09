package oop_121788_abthal.week06.Task

class SmartSpeaker(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable {

    override fun turnOn() {
        println("Smart Speaker $name aktif.")
    }

    override fun turnOff() {
        println("Smart Speaker $name nonaktif.")
    }

    fun playMusic(song: String) {
        println("Memutar lagu $song dari Spotify.")
    }
}