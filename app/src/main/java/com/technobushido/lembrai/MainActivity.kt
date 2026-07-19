package com.technobushido.lembrai

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.technobushido.lembrai.ui.theme.LembraiTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val minhaLista = listOf(
            Pessoa("Carlos", "09/08/1997", "Amigos"),
            Pessoa("Andre", "09/08/2000", "Familia"),
            Pessoa("Gilmara", "30/10/1987", "Melhores amigos")
        )


        setContent {
            LembraiTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                   ListaAniversario(pessoas = minhaLista,
                       modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun ListaAniversario(pessoas: List<Pessoa>, modifier: Modifier = Modifier){

    LazyColumn (modifier = modifier){
        items(pessoas){ pessoa ->
           Card(modifier = Modifier.fillMaxWidth().padding(8.dp)){
               Column(modifier = Modifier.padding(12.dp)){
                   Text(text = pessoa.nome, style = MaterialTheme.typography.titleMedium)
                   Text(text = pessoa.dataNascimento, style = MaterialTheme.typography.bodySmall)
                   Text(text = pessoa.categoria, style = MaterialTheme.typography.bodySmall)
               }
           }
        }
    }

}

