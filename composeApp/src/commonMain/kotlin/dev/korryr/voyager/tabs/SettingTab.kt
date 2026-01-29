package dev.korryr.voyager.tabs

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import cafe.adriel.voyager.navigator.Navigator
import cafe.adriel.voyager.navigator.tab.Tab
import cafe.adriel.voyager.navigator.tab.TabOptions
import cafe.adriel.voyager.transitions.SlideTransition
import dev.korryr.voyager.screens.SettingScreen

object SettingTab: Tab {

    override val options: TabOptions
        @Composable
        get() {
            val title = "Settings"
            val icon = rememberVectorPainter(Icons.Default.Settings)
            val index: UShort = 2u

            return TabOptions(
                index = index,
                title = title,
                icon = icon
            )
            
        }

    @Composable
    override fun Content() {
        Navigator(
            screen = SettingScreen()

        ){
            SlideTransition(it)

        }
    }

}