package dev.korryr.voyager.tabs

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import cafe.adriel.voyager.navigator.tab.Tab
import cafe.adriel.voyager.navigator.tab.TabOptions

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
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ){
                Text("Profile Tab")

            }
        }


}