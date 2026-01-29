package dev.korryr.voyager.tabs

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import cafe.adriel.voyager.navigator.Navigator
import cafe.adriel.voyager.navigator.tab.Tab
import cafe.adriel.voyager.navigator.tab.TabOptions
import cafe.adriel.voyager.transitions.SlideTransition
import dev.korryr.voyager.screens.ProfileScreen1

object ProfileTab : Tab {
    override val options: TabOptions
        @Composable
        get() {
            val title = "Profile"
            val icon = rememberVectorPainter(Icons.Default.Person)
            val index: UShort = 1u

            return TabOptions(
                index = index,
                title = title,
                icon = icon
            )
        }

    @Composable
    override fun Content() {
        Navigator(ProfileScreen1()) { navigator ->
            SlideTransition(navigator)
        }
    }
}