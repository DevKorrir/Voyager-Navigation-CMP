package dev.korryr.voyager

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform