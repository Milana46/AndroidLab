package by.example.pocemon.domain

import by.example.pocemon.domain.entity.PocemonEntity


interface PocemonRepository {

    fun getPocemonList(): List<PocemonEntity>

}

