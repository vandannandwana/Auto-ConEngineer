package org.vandan.autosoft.autocon.navigations

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import org.vandan.autosoft.autocon.presentation.CreateProjectScreen
import org.vandan.autosoft.autocon.presentation.NewProjectScreen
import org.vandan.autosoft.autocon.presentation.TemplateProjectScreen

@Composable
fun Navigation(navHostController: NavHostController) {

    NavHost(navController = navHostController, startDestination = Screens.NewProjectScreen.route){

        composable(route = Screens.NewProjectScreen.route) {
            NewProjectScreen(navHostController = navHostController)
        }

        composable(route = Screens.CreateProjectScreen.route) {
            CreateProjectScreen(navHostController = navHostController)
        }

        composable(route = Screens.TemplateProjectScreen.route){
            TemplateProjectScreen(navHostController = navHostController)
        }

    }

}