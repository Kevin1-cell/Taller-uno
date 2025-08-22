package Entities

// Class representing a Patient
class Patient(
    fullName: String,
    idNumber: Int,
    gender: String,
    email: String,
    var phoneNumber: String,
    var address: Address
) : Person(fullName, idNumber, gender, email)
