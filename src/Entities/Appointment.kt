package Entities

// Class that models an Appointment
data class Appointment(
    var code: Int,
    var patient: Patient,
    var doctor: Doctor,
    var date: String,
    var time: String,
    var reason: String
)
