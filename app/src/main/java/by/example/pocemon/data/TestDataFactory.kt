package by.example.pocemon.data

import android.content.Context
import by.example.pocemon.R
import by.example.pocemon.domain.PocemonInteractor
import by.example.pocemon.domain.entity.PocemonEntity

class TestDataFactory(val context:Context) : PocemonInteractor.PocemonRepository {

    override fun getPocemonList(): List<PocemonEntity> {
        return listOf(
            PocemonEntity(
                image = R.drawable.bulbasaur,
                name = "Bulvazaur",
                weight = 7,
                height = 123
            ),
            PocemonEntity(
                image = R.drawable.venisaur,
                name = "Venizavr",
                weight = 17,
                height = 321
            ),
        )
    }



}
