package com.arcgis.voyagernavigationsamplekotlin.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.selection.selectable
import androidx.compose.material.Divider
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.arcgis.voyagernavigationsamplekotlin.R
import com.arcgis.voyagernavigationsamplekotlin.data.Movie
import com.arcgis.voyagernavigationsamplekotlin.data.getMovies

object MovieScreen : Screen {
    @Composable
    override fun Content() {
        // MovieScreen()
        Scaffold(
            topBar = {
                TopAppBar(
                    title = {
                        Text("Movies")
                    }
                )
            }
        ) {
            it
            MovieScreen()
        }
    }
}

@Composable
fun MovieScreen() {
    val navigator = LocalNavigator.currentOrThrow
    Column(
        modifier = Modifier
            .fillMaxSize()
            .wrapContentSize(Alignment.Center)
    ) {
        val movieList: List<Movie> = getMovies()
        Column(modifier = Modifier.padding(12.dp)) {
            LazyColumn(modifier = Modifier.fillMaxHeight().padding(bottom = 20.dp)) {
                items(items = movieList, itemContent = { item ->
                    Row(
                        modifier =
                        Modifier
                            .padding(10.dp)
                            .fillMaxWidth()
                            .selectable(
                                selected = true,
                                onClick = { navigator.push(MovieDetails(item)) })
                    ) {
                        AsyncImage(
                            model = ImageRequest.Builder(LocalContext.current)
                                .data(item.poster)
                                .crossfade(true)
                                .placeholder(R.drawable.ic_movie)
                                .error(R.drawable.ic_book)
                                .build(),
                            contentDescription = "movie Image",
                            modifier = Modifier
                                .height(60.dp)
                                .width(60.dp),
                            contentScale = ContentScale.Crop
                        )
                        Column(
                            modifier = Modifier
                                .padding(start = 10.dp)
                                .fillMaxHeight()
                                .align(Alignment.CenterVertically),
                            verticalArrangement = Arrangement.Center
                        ) {
                            Text(
                                text = item.title,
                                color = Color.Black,
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Bold
                            )
                            Spacer(Modifier.height(2.dp))
                            Text(text = item.year, color = Color.Black, fontSize = 14.sp)
                            Spacer(Modifier.height(2.dp))
                        }
                    }
                    Spacer(modifier = Modifier.height(2.dp))
                    Divider(
                        color = Color.Gray,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(0.7.dp)
                    )

                })
            }
        }
    }
}
