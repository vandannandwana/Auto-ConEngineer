package org.vandan.autosoft.autocon.models

data class ExtrasModel(
    val name: String,
    val extraCost: Double,
    val quantities: Int,
    val brand: String? = null,
    val warranty: String? = null
)
