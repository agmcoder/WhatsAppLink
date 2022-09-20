package com.example.whatsapplink.android.ui.menu

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
    //val baseURL: String
    //val _number : MutableStateFlow<String>
    val number : StateFlow<String>

    fun callAPI(context: Context)
    fun URIGenerator(number: String): String
    fun updateNumber(input: String)
}

class MenuViewModel : ViewModel(), IMenuViewModel {
    private val baseURL = "https://api.whatsapp.com/send?phone=34"
    //group number properties
    private  val _number : MutableStateFlow<String> = MutableStateFlow("")
    override var number = _number.asStateFlow()




    //functions
    override fun callAPI(context : Context) {
        val uri = URIGenerator(number.value)
        val apiIntent = Intent(
            Intent.ACTION_VIEW,
            Uri.parse(uri)
        )

        context.startActivity(apiIntent)
    }

    override fun URIGenerator(number: String): String {
        return baseURL + number
    }

    override fun updateNumber(input: String) {
        viewModelScope.launch {
            _number.value = input
        }
    }

}