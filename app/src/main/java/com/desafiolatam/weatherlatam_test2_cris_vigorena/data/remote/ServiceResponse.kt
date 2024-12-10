package com.desafiolatam.weatherlatam_test2_cris_vigorena.data.remote

sealed class ServiceResponse<T> {
    data class Loading<T>(val isLoading: Boolean) : ServiceResponse<T>()
    data class Success<T>(val data: T) : ServiceResponse<T>()
    data class Error<T>(val error: String) : ServiceResponse<T>()
}