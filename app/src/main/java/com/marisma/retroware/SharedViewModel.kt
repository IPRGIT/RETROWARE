package com.marisma.retroware


import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


class SharedViewModel : ViewModel() {
    private val _favoritos = MutableLiveData<List<Videojuego>>(emptyList())
    val favoritos: LiveData<List<Videojuego>> get() = _favoritos

    fun agregarFavorito(videojuego: Videojuego) {
        _favoritos.value = _favoritos.value?.toMutableList()?.apply { add(videojuego) }
    }

    fun eliminarFavorito(videojuego: Videojuego) {
        _favoritos.value = _favoritos.value?.toMutableList()?.apply { remove(videojuego) }
    }
}
