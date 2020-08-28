package com.example.firstapplication.database

data class Contact (
    var id: Long = 0L,
    var name: String = "unnamed",
    var address: String = "",
    var phone: String = ""
)