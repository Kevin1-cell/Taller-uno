package Entities

// The main Clinic class that stores doctors and patients
class Clinic(
    var name: String,
    var address: Address,
    var taxId: String
) {
    val doctors: MutableList<Doctor> = mutableListOf()
    val patients: MutableList<Patient> = mutableListOf()

    // ---------------- CRUD DOCTORS ----------------
    fun addDoctor(doctor: Doctor) = doctors.add(doctor)

    fun removeDoctor(id: Int) = doctors.removeIf { it.idNumber == id }

    fun updateDoctor(id: Int, updated: Doctor) {
        val index = doctors.indexOfFirst { it.idNumber == id }
        if (index != -1) doctors[index] = updated
    }

    fun getDoctor(id: Int): Doctor? = doctors.find { it.idNumber == id }

    // ---------------- CRUD PATIENTS ----------------
    fun addPatient(patient: Patient) = patients.add(patient)

    fun removePatient(id: Int) = patients.removeIf { it.idNumber == id }

    fun updatePatient(id: Int, updated: Patient) {
        val index = patients.indexOfFirst { it.idNumber == id }
        if (index != -1) patients[index] = updated
    }

    fun getPatient(id: Int): Patient? = patients.find { it.idNumber == id }

    // ---------------- Statistics ----------------
    fun totalSalaries(): String {
        val total = doctors.sumOf { it.salary }
        return "%,.2f".format(total) // format with commas and decimals
    }

    fun salariesBySpecialty(): Map<String, Double> =
        doctors.groupBy { it.specialty }
            .mapValues { entry -> entry.value.sumOf { it.salary } }

    fun patientsByGender(): Map<String, Int> =
        patients.groupBy { it.gender }
            .mapValues { it.value.size }

    fun doctorsBySpecialty(): Map<String, Int> =
        doctors.groupBy { it.specialty }
            .mapValues { it.value.size }

    fun mostSeniorDoctor(): Doctor? =
        doctors.minByOrNull { it.yearJoined }
}
