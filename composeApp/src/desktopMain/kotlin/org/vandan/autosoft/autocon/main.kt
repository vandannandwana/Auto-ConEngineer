package org.vandan.autosoft.autocon

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Auto-Con Engineer",
    ) {
        App()
    }
}