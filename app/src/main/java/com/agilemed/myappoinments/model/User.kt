package com.agilemed.myappoinments.model


/*
"id": 2,
"name": "Paciente Test",
"email": "patient@agilemed.com",
"dni": null,
"address": null,
"phone": null,
"role": "patient"
 */

data class User(
    val id: Int,
    val name: String,
    val email: String,
    val dni: String,
    val address: String,
    val phone: String,
    val role: String
)