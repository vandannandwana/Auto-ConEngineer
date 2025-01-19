package org.vandan.autosoft.autocon.models

import auto_conengineer.composeapp.generated.resources.Res
import auto_conengineer.composeapp.generated.resources.four_bhk
import auto_conengineer.composeapp.generated.resources.one_bhk
import auto_conengineer.composeapp.generated.resources.three_bhk
import auto_conengineer.composeapp.generated.resources.two_bhk
import org.jetbrains.compose.resources.DrawableResource

data class HouseModel(
    val houseId: Int,
    val name: String,
    val address: String,
    val lengthOfFloor: Double,
    val widthOfFloor: Double,
    val walls: List<WallModel>,
    val pillars: List<PillarModel>,
    val twoDImages: List<DrawableResource>,
    val threeDImages: List<DrawableResource>,
    val extras: List<ExtrasModel>,
    val floors: Int = 1
){

    val costOfWalls = getCostOfWalls()

    private fun getCostOfWalls(): Double {
        val totalCost = 0.0
        
    }

    val costOfSlabs = getCostOfSlabs()

    private fun getCostOfSlabs(): Double {

    }

    val costOfExtras = getCostOfExtras()

    private fun getCostOfExtras(): Double {

    }

    val costOfFloors = getCostOfFloors()

    private fun getCostOfFloors(): Double {

    }

    val totalCost = getTotalCost()

    private fun getTotalCost(): Double {

    }


}


val houses = listOf(
    HouseModel(
        houseId = 1,
        name = "1 BHK",
        address = "123 Dream Street, Cityville",
        lengthOfFloor = 100.0,
        widthOfFloor = 100.0,
        walls = listOf(
            WallModel(id = 1, length = 10.0, height = 20.0),
            WallModel(id = 2, length = 15.0, height = 25.0)
        ),
        pillars = listOf(
            PillarModel(4000),
            PillarModel(4000),
            PillarModel(4000),
            PillarModel(4000),
        ),
        twoDImages = listOf(Res.drawable.one_bhk),
        threeDImages = listOf(Res.drawable.one_bhk),
        extras = listOf(
            ExtrasModel(name = "Geezer", extraCost = 2000.0, quantities = 2, brand = "ABC", warranty = "5 years"),
            ExtrasModel(name = "Washing Machine", extraCost = 3000.0, quantities = 1, brand = "XYZ", warranty = "3 years")
        )
    ),HouseModel(
        houseId = 2,
        name = "Studio Apartment",
        address = "456 Cozy Lane, Metropolis",
        lengthOfFloor = 50.0,
        widthOfFloor = 50.0,
        walls = listOf(
            WallModel(id = 1, length = 8.0, height = 10.0),
            WallModel(id = 2, length = 10.0, height = 12.0)
        ),
        pillars = listOf(PillarModel(2000), PillarModel( 2000)),
        twoDImages = listOf(Res.drawable.two_bhk),
        threeDImages = listOf(Res.drawable.two_bhk),
        extras = listOf(
            ExtrasModel(name = "Air Conditioner", extraCost = 1500.0, quantities = 1, brand = "CoolAir", warranty = "2 years"),
            ExtrasModel(name = "Smart Lights", extraCost = 500.0, quantities = 4, brand = "BrightTech", warranty = "1 year")
        )
    ),HouseModel(
        houseId = 3,
        name = "2 BHK Apartment",
        address = "789 Comfort Avenue, Greenfield",
        lengthOfFloor = 150.0,
        widthOfFloor = 100.0,
        walls = listOf(
            WallModel(id = 1, length = 12.0, height = 18.0),
            WallModel(id = 2, length = 15.0, height = 20.0),
            WallModel(id = 3, length = 10.0, height = 15.0)
        ),
        pillars = listOf(PillarModel(3000), PillarModel( 3000), PillarModel( 3000)),
        twoDImages = listOf(Res.drawable.three_bhk),
        threeDImages = listOf(Res.drawable.three_bhk),
        extras = listOf(
            ExtrasModel(name = "Water Purifier", extraCost = 1200.0, quantities = 1, brand = "PureLife", warranty = "3 years"),
            ExtrasModel(name = "Microwave Oven", extraCost = 2000.0, quantities = 1, brand = "QuickHeat", warranty = "2 years")
        )
    ),HouseModel(
        houseId = 4,
        name = "Luxury Villa",
        address = "123 Prestige Boulevard, Dreamland",
        lengthOfFloor = 300.0,
        widthOfFloor = 200.0,
        walls = listOf(
            WallModel(id = 1, length = 20.0, height = 30.0),
            WallModel(id = 2, length = 25.0, height = 35.0),
            WallModel(id = 3, length = 30.0, height = 40.0),
            WallModel(id = 4, length = 15.0, height = 25.0)
        ),
        pillars = listOf(
            PillarModel(5000),
            PillarModel(5000),
            PillarModel(5000),
            PillarModel(5000),
            PillarModel(5000),
        ),
        twoDImages = listOf(Res.drawable.four_bhk),
        threeDImages = listOf(Res.drawable.four_bhk),
        extras = listOf(
            ExtrasModel(name = "Swimming Pool", extraCost = 10000.0, quantities = 1, brand = "AquaDeluxe", warranty = "10 years"),
            ExtrasModel(name = "Home Theatre", extraCost = 5000.0, quantities = 1, brand = "CinemaMax", warranty = "5 years"),
            ExtrasModel(name = "Solar Panels", extraCost = 8000.0, quantities = 1, brand = "GreenEnergy", warranty = "20 years")
        )
    )
)

