package com.spindoctor.vintage

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform