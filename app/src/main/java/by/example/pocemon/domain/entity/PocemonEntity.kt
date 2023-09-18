package by.example.pocemon.domain.entity

import android.graphics.drawable.Drawable
import java.io.Serializable

data class PocemonEntity(
    var image: Int,
    var name: String,
    var weight: Int,
    var height: Int
) : Serializable




