package org.vandan.autosoft.autocon.models

data class WallModel(
    val id: Int,
    val length: Double,
    val height: Double
) {
    val area: Double

    init {
        require(length > 0) { "Wall length must be a positive value." }
        require(height > 0) { "Wall height must be a positive value." }
        area = length * height
    }

    override fun toString(): String {
        return "Wall $id: ${length}x${height}, Area: $area sqft"
    }
}
