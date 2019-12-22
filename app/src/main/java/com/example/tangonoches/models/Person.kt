package com.example.tangonoches.models

class Person(
    val id: Long,
    val firstName: String,
    val lastName: String
){
    override fun toString(): String {
        return "${this.id} ${this.firstName} ${this.lastName}"
    }
}