package com.example.app.entity

class User() {
     var username: String? = null
     var password: String? = null
     var code: String? = null

    constructor(username: String?, password: String?, code: String?) : this() {
        this.username = username
        this.password = password
        this.code = code
    }
}