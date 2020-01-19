package br.com.data.local.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Transaction
import br.com.data.local.model.AnimesCache
import io.reactivex.Single

@Dao
interface AnimesDao {

    @Query("SELECT * FROM animesdb")
    fun getAnimes(): Single<List<AnimesCache>>

    @Transaction
    fun updateData(animes: List<AnimesCache>){
        deleteAll()
        insertAll(animes)
    }

    @Insert
    fun insertAll(animes: List<AnimesCache>)

    @Query("DELETE FROM animesdb")
    fun deleteAll()
}