package by.example.pocemon

import java.io.Serializable


data class Pocemon(
    var name: String,
    var weight: Int,
    var height: Int,
    //val id

) : Serializable

