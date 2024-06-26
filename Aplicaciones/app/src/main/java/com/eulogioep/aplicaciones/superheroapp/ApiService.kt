package com.eulogioep.aplicaciones.superheroapp

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {

    @GET("api/c755fa1bb5d6e8288621f7785afc2586/search/{name}")
    suspend fun getSuperheroes(@Path("name") superheroName: String) : Response<SuperHeroDataResponse>

}