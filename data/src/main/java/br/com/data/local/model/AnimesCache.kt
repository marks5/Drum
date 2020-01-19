package br.com.data.local.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "animesdb")
data class AnimesCache(
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0,
    var idApi: String = "",
    var nome: String = "",
    var desc: String = "",
    var status: String = "",
    var imagem: String = "",
    var ano: String = "",
    var categoria: String = "",
    var rank: Int = 0
)