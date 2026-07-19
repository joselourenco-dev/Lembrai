package com.technobushido.lembrai

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "pessoas")
data class Pessoa(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val nome: String,
    val dataNascimento: String,
    val categoria: String
    )

