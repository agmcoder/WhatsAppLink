package com.example.whatsapplink.android.UI.menu

import android.content.Intent
import android.net.Uri
import androidx.lifecycle.ViewModel
import com.example.whatsapplink.android.model.NumberObject


class MenuViewModel : ViewModel() {
val baseURL = "https://api.whatsapp.com/send?phone=34"


    fun callApi(numberObject : NumberObject)
    {
        val uri = URIGenerator(numberObject.number)
        val apiIntent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse(uri)
            )

        numberObject.context.startActivity(apiIntent)
    }

    fun URIGenerator(number : String): String{
        return baseURL+number
    }

}