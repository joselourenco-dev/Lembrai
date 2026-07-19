package com.technobushido.lembrai

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface PessoaDao {
    @Insert
    suspend fun inserir(pessoa: Pessoa)

    @Delete
    suspend fun deletar(pessoa: Pessoa)

    @Query("SELECT * FROM pessoas")
    fun listarTodos(): Flow<List<Pessoa>>
}