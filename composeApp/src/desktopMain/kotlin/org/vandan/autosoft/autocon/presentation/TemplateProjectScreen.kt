package org.vandan.autosoft.autocon.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import org.jetbrains.compose.resources.painterResource
import org.vandan.autosoft.autocon.models.HouseModel
import org.vandan.autosoft.autocon.models.PillarModel
import org.vandan.autosoft.autocon.models.WallModel
import org.vandan.autosoft.autocon.models.houses
import org.vandan.autosoft.autocon.presentation.components.TemplateItem
import org.vandan.autosoft.autocon.presentation.components.TopAppBar

@Composable
fun TemplateProjectScreen(
    navHostController: NavHostController,
    modifier: Modifier = Modifier
) {
    Scaffold(
        topBar = {
            TopAppBar {
                navHostController.popBackStack()
            }
        }
    ) {

        var totalCost by remember { mutableStateOf("0") }

        var currentHouseModel by remember {
            mutableStateOf(houses[0])
        }


        Row(
            modifier = Modifier.fillMaxSize().padding(16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.Top
        ) {


            Column(
                verticalArrangement = Arrangement.spacedBy(16.dp),
                modifier = Modifier.weight(0.3f),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                //Filters
            }

            //Main-Column

            Column(
                modifier = Modifier.weight(0.4f),
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                // Cost Calculation
                Text("Total Cost: $totalCost", style = MaterialTheme.typography.h5)
                MiddleScreenPart(currentHouseModel = currentHouseModel)
                Text("Current Selected Model is ${currentHouseModel.name}")

            }
            Column(
                modifier = Modifier.weight(0.3f),
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text("Select House Template:")
                Spacer(modifier = Modifier.height(24.dp))
                LazyColumn(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.spacedBy(28.dp),
                    modifier = Modifier.height(600.dp)
                ) {

                    items(houses) { house ->
                        TemplateItem(house) {
                            currentHouseModel = it
                        }
                    }

                }
            }

        }
    }
}

@Composable
fun MiddleScreenPart(currentHouseModel: HouseModel) {

    Column {
        //Images of Model
        Box(
            modifier=Modifier
                .clip(RoundedCornerShape(24.dp))
                .fillMaxWidth()
                .height(340.dp)
        ) {
            Image(
                painter = painterResource(
                    currentHouseModel.twoDImages.first()
                ),
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop,
                contentDescription = "Model Image"
            )
        }

    }

}
