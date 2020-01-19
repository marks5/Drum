package br.com.data.local.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import br.com.data.local.model.AnimesCache

@Database(version = 1, exportSchema = false, entities = [AnimesCache::class])
abstract class AnimesDB: RoomDatabase(){
    abstract fun animesDao(): AnimesDao

    companion object {
        fun createDB(context: Context) : AnimesDB{
            return Room
                .databaseBuilder(context, AnimesDB::class.java, "Animes.db")
                .build()
        }
    }
}