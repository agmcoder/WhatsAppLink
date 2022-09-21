package com.example.whatsapplink.android.service.data

import com.example.whatsapplink.android.R
import java.util.*

data class CountryData(
    private var cCodes: String,
    val countryPhoneCode: String = "+45",
    val cNames:String = "es",
    val flagResID: Int = R.drawable.es
) {
    val countryCode = cCodes.lowercase(Locale.getDefault())
}
