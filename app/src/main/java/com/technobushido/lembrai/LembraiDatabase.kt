package com.technobushido.lembrai

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Pessoa::class], version = 1)
abstract class LembraiDatabase : RoomDatabase(){
    abstract fun pessoaDao(): PessoaDao
    companion object{
        @Volatile
        private var INSTANCE: LembraiDatabase? = null

        fun getInstance(context: Context): LembraiDatabase{
            return INSTANCE ?: synchronized(this){
                val instance = Room.databaseBuilder(
                context,
                LembraiDatabase::class.java,
                    "lembraidatabse"
                ).build()
                INSTANCE = instance
                instance
            }
        }

    }
}
