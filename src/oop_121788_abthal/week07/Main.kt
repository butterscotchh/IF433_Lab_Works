package oop_121788_abthal.week07

println("\n=== TEST SEALED CLASS ===")

val response: ApiResponse = ApiResponse.Success("Data berhasil ditarik!")

val uiMessage = when(response) {

    is ApiResponse.Success -> "Tampilkan: ${response.data}"

    is ApiResponse.Error -> "Munculkan alert: ${response.message}"

    ApiResponse.Loading -> "Tampilkan Spinner"

}

println(uiMessage)