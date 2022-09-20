package com.example.whatsapplink.android.UI.menu

import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch


interface IMenuViewModel{
    val baseURL: String
    val _number : MutableStateFlow<String>
    val number : StateFlow<String>

    fun callAPI(context: Context)
}

class MenuViewModel : ViewModel(), IMenuViewModel {
    val baseURL = "https://api.whatsapp.com/send?phone=34"
    //group number properties
    private val _number : MutableStateFlow<String> = MutableStateFlow("")
    var number = _number.asStateFlow()




    //functions
    fun callAPI(context : Context) {
        val uri = URIGenerator(number.value)
        val apiIntent = Intent(
            Intent.ACTION_VIEW,
            Uri.parse(uri)
        )

        context.startActivity(apiIntent)
    }

    private fun URIGenerator(number: String): String {
        return baseURL + number
    }

    fun updateNumber(input: String) {
        viewModelScope.launch {
            _number.value = input
        }
    }

}