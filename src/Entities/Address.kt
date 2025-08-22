package Entities

// Address information for both patients and the hospital
data class Address(
    var street: String,
    var number: String,
    var district: String,
    var city: String,
    var postalCode: Int
)
