package oop_121788_abthal.week06.Task

// SmartHomeHub.kt

class SmartHomeHub {
    val devices = mutableListOf<SmartDevice>()

    fun addDevice(device: SmartDevice) {
        devices.add(device)
    }

    fun turnOffAllSwitches() {
        println("\n--- Mematikan Semua Saklar ---")
        for (device in devices) {
            if (device is Switchable) {
                device.turnOff()
            }
        }
    }

    fun activateSecurityMode() {
        println("\n--- Mengaktifkan Mode Keamanan ---")
        for (device in devices) {
            // Smart casting ke Recordable
            if (device is Recordable) {
                device.startRecord()
            }
            // Smart casting ke SmartSpeaker
            if (device is SmartSpeaker) {
                device.playMusic("Sirine Peringatan")
            }
        }
    }
}