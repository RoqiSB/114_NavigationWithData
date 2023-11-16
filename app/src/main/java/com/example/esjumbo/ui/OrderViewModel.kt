package com.example.esjumbo.ui

import androidx.lifecycle.ViewModel
import com.example.esjumbo.data.OrderUiState
import com.example.esjumbo.data.PelangganUiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import java.text.NumberFormat


private const val HARGA_PER_CUP = 3000
class OrderViewModel: ViewModel() {
    private val _stateUI = MutableStateFlow(OrderUiState())
    private val _pelangganUI = MutableStateFlow(PelangganUiState())
    val stateUI: StateFlow<OrderUiState> = _stateUI.asStateFlow()
    val pelangganUI : StateFlow<PelangganUiState> = _pelangganUI.asStateFlow()

    fun setData(list: MutableList<String>){
        _pelangganUI.update { stateSaatIni -> stateSaatIni.copy(
            nama = list[0],
            alamat = list[1],
            tlp = list[2]
        ) }
    }
    fun setJumlah(jmlEsJumbo:Int){
        _stateUI.update { stateSaatini ->
            stateSaatini.copy(
                jumlah = jmlEsJumbo,
                harga = hitungHarga(jumlah = jmlEsJumbo)
            )
        }
    }
    fun setRasa(rasaPilihan: String){
        _stateUI.update { stateSaatini -> stateSaatini.copy(rasa = rasaPilihan) }
    }

    fun resetOrder(){
        _stateUI.value = OrderUiState()
    }

    private fun hitungHarga(
        jumlah: Int = _stateUI.value.jumlah,
    ):String{
        val kalkulasiHarga = jumlah * HARGA_PER_CUP

        return NumberFormat.getNumberInstance().format(kalkulasiHarga)
    }

}