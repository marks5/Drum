package br.com.data.remote.model

import com.google.gson.annotations.SerializedName

class AnimeJobPayload (
    @SerializedName("value")
    val animesPayload: List<AnimePayload>
)

class AnimePayload (
    @SerializedName("Id")
    val idApi: String,
    @SerializedName("Nome")
    val nome: String,
    @SerializedName("Desc")
    val desc: String,
    @SerializedName("Status")
    val status: String,
    @SerializedName("Imagem")
    val imagem: String,
    @SerializedName("Ano")
    val ano: String,
    @SerializedName("Categoria")
    val categoria: String,
    @SerializedName("Rank")
    val rank: Int
)