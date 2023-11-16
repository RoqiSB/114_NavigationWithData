package com.example.esjumbo.ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

@Composable
fun HalamanDataPelanggan(){
    var namaTxt by remember {
        mutableStateOf("")
    }
    var alamatTxt by remember {
        mutableStateOf("")
    }
    var tlpnTxt by remember {
        mutableStateOf("")
    }
    var listData: MutableList<String> = mutableListOf(namaTxt,alamatTxt,tlpnTxt)
}