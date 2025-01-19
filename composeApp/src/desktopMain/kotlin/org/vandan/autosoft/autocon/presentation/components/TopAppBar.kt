package org.vandan.autosoft.autocon.presentation.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun TopAppBar(modifier: Modifier = Modifier, onBackClick:()->Unit) {

    Column(
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.Center
    ){
        Icon(imageVector = Icons.AutoMirrored.Filled.ArrowBack,
            contentDescription = "backIcon",
            modifier = Modifier.clickable {
                onBackClick()
            }
        )
    }

}