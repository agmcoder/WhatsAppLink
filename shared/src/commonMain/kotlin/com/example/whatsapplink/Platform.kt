package com.example.whatsapplink

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform