package com.technobushido.lembrai

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Pessoa::class], version = 1)
abstract class LembraiDatabase : RoomDatabase(){
    abstract fun pessoaDao(): PessoaDao
}
