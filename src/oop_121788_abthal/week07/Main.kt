package oop_121788_abthal.week07

val response: ApiResponse = ApiResponse.Success("Data berhasil ditarik!")

when(response) {

    is ApiResponse.Success ->
    println("Tampilkan: ${response.data}")

    is ApiResponse.Error ->
    println("Munculkan alert: ${response.message}")

}