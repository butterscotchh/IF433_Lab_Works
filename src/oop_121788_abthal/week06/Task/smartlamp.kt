package oop_121788_abthal.week06.Task

class SmartLamp(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable {

    override fun turnOn() {
        println("Lampu $name menyala.")
    }

    override fun turnOff() {
        println("Lampu $name dimatikan.")
    }
}