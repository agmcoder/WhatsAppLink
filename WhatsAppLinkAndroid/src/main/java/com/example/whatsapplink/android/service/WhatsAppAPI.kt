package com.example.whatsapplink.android.service

class WhatsAppAPI {
    //properties
    private val baseURLSpain : String = "https://api.whatsapp.com/send?phone=34"


    //functions
    //fun navigateURLWhatsAppAPI(number: String)
    //{
        //val generatedURI : String = getWhatsAppURISpain()

    //}


    //this function is used to create the link to send a message to a number
    fun getWhatsAppURISpain(phoneNumber : String) : String {
        return baseURLSpain + phoneNumber



    }



}