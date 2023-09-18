package by.example.pocemon.presentation

import java.io.Serializable


data class Pocemon (
    var image: Int,
    var name: String,
    var weight: Int,
    var height: Int

) : Serializable
