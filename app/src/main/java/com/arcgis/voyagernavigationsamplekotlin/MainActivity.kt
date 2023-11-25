package com.arcgis.voyagernavigationsamplekotlin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.RowScope
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Home
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import cafe.adriel.voyager.navigator.Navigator
import cafe.adriel.voyager.navigator.tab.CurrentTab
import cafe.adriel.voyager.navigator.tab.LocalTabNavigator
import cafe.adriel.voyager.navigator.tab.Tab
import cafe.adriel.voyager.navigator.tab.TabNavigator
import cafe.adriel.voyager.navigator.tab.TabOptions
import com.arcgis.voyagernavigationsamplekotlin.screens.MovieScreen
import com.arcgis.voyagernavigationsamplekotlin.screens.SettingsScreen
import com.arcgis.voyagernavigationsamplekotlin.screens.SongsScreen
import com.arcgis.voyagernavigationsamplekotlin.ui.theme.VoyagerNavigationSampleKotlinTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            VoyagerNavigationSampleKotlinTheme {
                Surface {
                    TabNavigator(tab = HomeTab) {
                        Scaffold(
                            bottomBar = {
                                BottomNavigation {
                                    TabNavigationItems(tab = HomeTab)
                                    TabNavigationItems(tab = TvShowsTab)
                                    TabNavigationItems(tab = SongsTab)
                                    TabNavigationItems(tab = SettingsTab)
                                }
                            }
                        ) {
                            CurrentTab()
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun RowScope.TabNavigationItems(tab: Tab) {
    val tabNavigator = LocalTabNavigator.current

    BottomNavigationItem(selected = tabNavigator.current == tab,
        selectedContentColor = Color(R.color.white),
        onClick = { tabNavigator.current = tab },
        icon = { Icon(tab.options.icon!!, contentDescription = tab.options.title) }
    )
}

@Composable
fun TopBar() {
    TopAppBar(
        title = { Text(text = stringResource(R.string.app_name), fontSize = 18.sp) },
        backgroundColor = colorResource(id = R.color.purple_200),
        contentColor = Color.White
    )
}

@Preview(showBackground = true)
@Composable
fun TopBarPreview() {
    TopBar()
}

// Tabs
object HomeTab : Tab {
    override val options: TabOptions
        @Composable
        get() {
            val title = "Home"
            val icon = rememberVectorPainter(image = Icons.Rounded.Home)

            return remember {
                TabOptions(
                    0u,
                    title, icon
                )
            }
        }

    @Composable
    override fun Content() {
        Navigator(MovieScreen)
    }
}

object SettingsTab : Tab {

    override val options: TabOptions
        @Composable
        get() {

            val title = "Settings"
            val icon = rememberVectorPainter(Icons.Default.Settings)

            return remember {
                TabOptions(
                    1u,
                    title,
                    icon
                )
            }
        }

    @Composable
    override fun Content() {
        Navigator(SettingsScreen)
    }
}

object SongsTab : Tab {

    override val options: TabOptions
        @Composable
        get() {

            val title = "Songs"
            val icon = rememberVectorPainter(Icons.Default.Person)

            return remember {
                TabOptions(
                    1u,
                    title,
                    icon
                )
            }
        }

    @Composable
    override fun Content() {
        Navigator(SongsScreen)
    }
}

object TvShowsTab : Tab {
    override val options: TabOptions
        @Composable
        get() {
            val title = "Tv Show"
            val icon = rememberVectorPainter(image = Icons.Rounded.Email)

            return remember {
                TabOptions(
                    0u,
                    title, icon
                )
            }
        }

    @Composable
    override fun Content() {
        Navigator(MovieScreen)
    }
}