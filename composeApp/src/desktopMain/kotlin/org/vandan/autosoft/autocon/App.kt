package org.vandan.autosoft.autocon

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.*
import androidx.navigation.compose.rememberNavController
import org.vandan.autosoft.autocon.navigations.Navigation

@Composable
fun App() {
    MaterialTheme {

        val navHostController = rememberNavController()
        Navigation(navHostController = navHostController)

    }
}
