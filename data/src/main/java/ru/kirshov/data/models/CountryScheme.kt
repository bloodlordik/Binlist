package ru.kirshov.data.models

data class CountryScheme(
    val numeric:String,
    val alpha2: String,
    val name: String,
    val emoji:String,
    val currency:String,
    val latitude:Int,
    val longitude: Int
)
