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

    SmartDevice("Ezviz Outdoor", "Camera").apply {
        isOnline = true
        powerLoad = 5
    }.also {
        println("(LOG) Kamera terhubung")
        homeDevices.add(it)
    }

    val acInverter = "AC Inverter".run {
        val device = SmartDevice("Daikin Inverter (Kabel 3x2.5)", "HVAC", false, 800)
        device // Mengembalikan objek device untuk ditangkap variabel acInverter
    }
    homeDevices.add(acInverter)

    // Menambahkan alat pakan peliharaan secara langsung
    homeDevices.add(SmartDevice("Picolo's Auto Feeder", "Pet Care", true, 10))
}