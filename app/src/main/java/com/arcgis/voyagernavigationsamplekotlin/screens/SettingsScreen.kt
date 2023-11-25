package com.arcgis.voyagernavigationsamplekotlin.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.core.screen.Screen
import com.arcgis.voyagernavigationsamplekotlin.R

object SettingsScreen : Screen {
    @Composable
    override fun Content() {
        SettingsScreen()
    }
}

@Composable
fun SettingsScreen() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = stringResource(id = R.string.setting_text),
                        style = MaterialTheme.typography.h6
                    )
                },
            )
        }
    ) {
        Column(
            modifier = Modifier
                .verticalScroll(rememberScrollState())
                .padding(it)
                .padding(16.dp)
        ) {
            Column(modifier = Modifier.padding(2.dp)) {

                Row {
                    Text(
                        text = "User Name",
                        style = MaterialTheme.typography.h6,
                        textAlign = TextAlign.Start,
                    )
                }
                Spacer(modifier = Modifier.height(8.dp))
                Divider()

                Row {
                    Text(
                        text = "Phone",
                        style = MaterialTheme.typography.h6,
                        textAlign = TextAlign.Start,
                    )
                }
                Spacer(modifier = Modifier.height(8.dp))
                Divider()

                Row {
                    Text(
                        text = "Email Id",
                        style = MaterialTheme.typography.h6,
                        textAlign = TextAlign.Start,
                    )
                }
                Spacer(modifier = Modifier.height(8.dp))
                Divider()

                Row {
                    Text(
                        text = "Privacy Settings",
                        style = MaterialTheme.typography.h6,
                        textAlign = TextAlign.Start,
                    )
                }
                Spacer(modifier = Modifier.height(8.dp))
                Divider()
            }
        }
    }
}
