package oop_121788_abthal.week11.Task1

fun main() {
    val homeDevices = mutableListOf<SmartDevice>()

    SmartDevice(name = "", category = "").apply {
        name = "Philips WiZ Living Room"
        category = "Lighting"
        isOnline = true
        powerLoad = 12
    }.also {
        homeDevices.add(it)
    }
    // (Opsional) Cek apakah sudah masuk ke list
    homeDevices.forEach { println(it.diagnose()) }