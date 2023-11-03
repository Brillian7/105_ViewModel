package com.example.dataform

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class CobaViewModel : ViewModel() {
    var namaUsr: String by mutableStateOf("") //revised
        private set
    var noTlp: String by mutableStateOf("")
        private set
    var Email: String by mutableStateOf("")
        private set

    var alamatUsr: String by mutableStateOf("")
        private  set
    var jenisKl: String by mutableStateOf("")
        private set
    var Status: String by mutableStateOf("")
        private set
    private val _uiState = MutableStateFlow(Dataform())
    val uiState: StateFlow<Dataform> = _uiState.asStateFlow()

    fun insertData(nm: String, tlp: String,eml: String, almt: String,sts: String, jk: String){
        namaUsr = nm;
        noTlp = tlp;
        Email = eml;
        alamatUsr = almt;
        jenisKl = jk;
        Status = sts;
    }

    fun  setJenisK(pilihJK: String) {
        _uiState.update { currentState -> currentState.copy(sex = pilihJK) }
    }
    fun  setStatusOrang(pilihStatus: String) {
        _uiState.update { currentState -> currentState.copy(sex = pilihStatus) }
    }


}