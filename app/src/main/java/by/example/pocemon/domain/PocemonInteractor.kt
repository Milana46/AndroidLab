package by.example.pocemon.domain

import by.example.pocemon.data.TestDataFactory
import by.example.pocemon.domain.entity.PocemonEntity





    class PocemonInteractor(
        private val repository: PocemonRepository
    ) {

        fun getPocemonData(): List<PocemonEntity> {
            return repository.getPocemonList()
        }
    }



