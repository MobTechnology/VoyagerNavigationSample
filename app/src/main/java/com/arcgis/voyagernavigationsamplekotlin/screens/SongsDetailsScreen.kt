package com.arcgis.voyagernavigationsamplekotlin.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import coil.compose.AsyncImage
import com.arcgis.voyagernavigationsamplekotlin.data.Songs


data class SongsDetailsScreen(var song: Songs) : Screen {
    @Composable
    override fun Content() {
        loadSongDetail(song)
    }
}

@Composable
private fun loadSongDetail(song: Songs) {
    val navigator = LocalNavigator.currentOrThrow
    Scaffold(topBar = {
        TopAppBar(
            title = { Text(text = "Song Details", color = Color.White) },
            navigationIcon = {
                IconButton(
                    enabled = navigator.canPop,
                    onClick = navigator::pop
                ) {
                    Icon(
                        imageVector = Icons.Filled.ArrowBack,
                        contentDescription = "Back"
                    )
                }
            },
        )
    })
    {
        it
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
                .padding(it)
                .background(Color.White)
        ) {
            Text(text = song.artistName?:"", color = Color(0xFF0F9D58))
            AsyncImage(
                modifier = Modifier.padding(8.dp),
                model = song.artworkUrl100,
                contentDescription = "Translated description of what the image contains"
            )

            Text(text = song.description ?: "", color = Color(0xFF0F9D58), modifier = Modifier.padding(10.dp))
        }
    }
}
