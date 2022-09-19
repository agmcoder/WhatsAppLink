package com.example.whatsapplink.android.service

class WhatsAppAPI {
    //properties
    private val baseURLSpain : String = "https://api.whatsapp.com/send?phone=34"


    //functions










    //this function is used to create the link to send a message to a number
    fun getWhatsAppLinkSpain(phoneNumber : String) : String {
        return baseURLSpain + phoneNumber
    }



}