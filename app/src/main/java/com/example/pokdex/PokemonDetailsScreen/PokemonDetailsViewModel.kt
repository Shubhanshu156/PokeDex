package com.example.pokdex.PokemonDetailsScreen

import androidx.lifecycle.ViewModel
import com.example.pokdex.data.remote.responses.Pokemon
import com.example.pokdex.repository.PokemonRepository
import com.example.pokdex.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class PokemonDetailViewModel @Inject constructor(
    private val repository: PokemonRepository
) : ViewModel() {

    suspend fun getPokemonInfo(pokemonName: String): Resource<Pokemon> {
        return repository.getPokemonInfo(pokemonName)
    }
}