import Entities.*

// Entry point to test the Clinic System
fun main() {
    val clinicAddress = Address("10th Street", "20", "Downtown", "New York", 10001)
    val clinic = Clinic("New York Health Center", clinicAddress, "987654321")

    val doctor1 = Doctor("Alice Brown", 101, "Female", "alice@clinic.com", "LIC101", "Cardiology", 2012, 7500.0)
    val doctor2 = Doctor("Robert Wilson", 102, "Male", "robert@clinic.com", "LIC102", "Neurology", 2008, 8200.0)

    val patient1 = Patient("Emma Johnson", 201, "Female", "emma@gmail.com", "555-1111", Address("5th Ave", "15", "North", "New York", 10002))
    val patient2 = Patient("Michael Smith", 202, "Male", "michael@gmail.com", "555-2222", Address("8th Ave", "22", "South", "Boston", 21001))

    clinic.addDoctor(doctor1)
    clinic.addDoctor(doctor2)
    clinic.addPatient(patient1)
    clinic.addPatient(patient2)

    doctor1.assignedPatients.add(patient1)
    doctor2.assignedPatients.add(patient2)

    println("=== Clinic Report ===")
    println("Total Salaries: ${clinic.totalSalaries()}")
    println("Salaries by Specialty: ${clinic.salariesBySpecialty()}")
    println("Patients by Gender: ${clinic.patientsByGender()}")
    println("Doctors by Specialty: ${clinic.doctorsBySpecialty()}")
    println("Most Senior Doctor: ${clinic.mostSeniorDoctor()?.fullName} - Specialty: ${clinic.mostSeniorDoctor()?.specialty}")
}
