package oop_121788_abthal.week06

interface Clickable {
    // ERROR: Property in an interface cannot have a backing field
    val name: String = "Tombol Rahasia"

    fun click()
}