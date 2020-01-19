package br.com.domain.entities

data class Anime(
    val idApi: String,
    val nome: String,
    val desc: String,
    val status: String,
    val imagem: String,
    val ano: String,
    val categoria: String,
    val rank: Int
)