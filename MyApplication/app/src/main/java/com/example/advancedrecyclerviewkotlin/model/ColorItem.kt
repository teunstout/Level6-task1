package com.example.advancedrecyclerviewkotlin.model

data class ColorItem(
    var hex: String,
    var name: String
) {
    fun getImageUrl() = "http://singlecolorimage.com/get/$hex/1080x1080"
}
