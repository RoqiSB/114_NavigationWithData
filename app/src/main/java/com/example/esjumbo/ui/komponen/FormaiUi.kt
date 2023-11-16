package com.example.esjumbo.ui.komponen

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.esjumbo.R

@Composable
fun FormatLabelHarga(subtotal : String, modifier: Modifier = Modifier){
    Text(text = stringResource(R.string.subtotal_price, subtotal),
        modifier = modifier,
        style = MaterialTheme.typography.headlineSmall)
}
@Composable
fun FormatDataPelanggan(
    nmPelanggan: String,
    almtPelanggan: String,
    tlpPelanggan:String
){
    Text(
        text = stringResource(R.string.nama),
    )
    Text(nmPelanggan)
    Divider()
    Spacer(modifier = Modifier.padding(8.dp))


    Text(
        text = stringResource(R.string.alamat),
    )
    Text(almtPelanggan)
    Divider()
    Spacer(modifier = Modifier.padding(10.dp))


    Text(
        text = stringResource(R.string.telepon),
    )
    Text(tlpPelanggan)
    Divider()
}