package Entities

// Class representing a Doctor in the clinic
class Doctor(
    fullName: String,
    idNumber: Int,
    gender: String,
    email: String,
    var licenseCode: String,
    var specialty: String,
    var yearJoined: Int,
    var salary: Double
) : Person(fullName, idNumber, gender, email) {

    val assignedPatients: MutableList<Patient> = mutableListOf()
}
