package org.vandan.autosoft.autocon.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.ModifierInfo
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import auto_conengineer.composeapp.generated.resources.Res
import auto_conengineer.composeapp.generated.resources.new_project_screen_background
import org.jetbrains.compose.resources.painterResource
import org.vandan.autosoft.autocon.navigations.Screens
import org.vandan.autosoft.autocon.presentation.components.TopAppBar

@Composable
fun NewProjectScreen(
    navHostController: NavHostController
) {
    Scaffold(
        topBar = {
            TopAppBar {
                navHostController.popBackStack()
            }
        }
    ){
        Box(
            modifier = Modifier
                .fillMaxSize(),
            contentAlignment = Alignment.Center
        ){

            Image(
                painter = painterResource(Res.drawable.new_project_screen_background),
                contentDescription = "BackGroundImage",
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop
            )

            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(24.dp)
            ){
                NewProjectScreenCard(title = "Use Template",description = "Time is Very Precious, Save it"){
                    navHostController.navigate(Screens.TemplateProjectScreen.route)
                }
                NewProjectScreenCard(title = "Create Your Own",description = "Take All Controls in Your Hand"){
                    navHostController.navigate(Screens.CreateProjectScreen.route)
                }
            }

        }

    }
}

@Composable
fun NewProjectScreenCard(
    title:String,
    description:String,
    modifier: Modifier = Modifier,
    onClick:()->Unit
) {
    val colors = listOf(
        Color.Blue.copy(alpha = 0.3f),
        Color.White
    )
    val card_brush = Brush.linearGradient(colors = colors)

    Card(
        elevation = 7.dp,
        modifier = modifier
            .size(300.dp)
            .clickable {
                onClick()
            },
        shape = RoundedCornerShape(16.dp)
    ){
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(brush = card_brush)
                .padding(12.dp),
            contentAlignment = Alignment.Center,
        ){
            Column {
                Text(
                    title,
                    textAlign = TextAlign.Center,
                    fontSize = 34.sp,
                    modifier = Modifier
                        .fillMaxWidth()
                )
                Text(description,
                    textAlign = TextAlign.Center,
                    fontSize = 14.sp,
                    modifier = Modifier.fillMaxWidth()
                )
            }
        }
    }

}