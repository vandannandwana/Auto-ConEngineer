package org.vandan.autosoft.autocon.presentation

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import org.vandan.autosoft.autocon.presentation.components.TopAppBar

@Composable
fun CreateProjectScreen(
    navHostController: NavHostController,
    modifier: Modifier = Modifier
) {
    Scaffold(topBar = {
        TopAppBar {
            navHostController.popBackStack()
        }
    }){

    }

    Box(
        modifier = modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        Text("Create Project Screen")
    }
}