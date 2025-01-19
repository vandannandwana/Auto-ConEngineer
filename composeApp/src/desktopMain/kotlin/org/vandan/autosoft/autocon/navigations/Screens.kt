package org.vandan.autosoft.autocon.navigations

sealed class Screens( val route:String) {

    object NewProjectScreen:Screens(route = "new_project_screen")
    object TemplateProjectScreen:Screens(route = "template_project_screen")
    object CreateProjectScreen:Screens(route = "create_project_screen")

}