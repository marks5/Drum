package br.com.data.remote.api

import br.com.data.remote.model.AnimeJobPayload
import io.reactivex.Single
import retrofit2.http.GET

interface ServerApi{
    @GET("/odata/Animesdb")
    fun fetchAnimes(): Single<AnimeJobPayload>
}