package br.com.paulosalvatore.ocean_a5_13_11_18

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

class UsuariosViewModel : ViewModel() {
	val nome = MutableLiveData<String>()
}
