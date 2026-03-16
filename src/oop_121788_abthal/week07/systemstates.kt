package oop_121788_abthal.week07

sealed class ApiResponse {

    data class Success(val data: String) : ApiResponse()

    data class Error(val message: String) : ApiResponse()

    object Loading : ApiResponse()

}