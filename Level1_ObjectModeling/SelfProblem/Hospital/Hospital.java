//Importing required packages
import java.util.ArrayList;
import java.util.List;

//create a class Hospital with name, doctors and patients as attributes
public class Hospital {
    private String name;
    private List<Doctor> doctors;
    private List<Patient> patients;

    // create a constructor with name as parameter
    public Hospital(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    // Add a doctor to the hospital
    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    // Add a patient to the hospital
    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    // create a getter for name
    public String getName() {
        return name;
    }

    // create a getter for doctors
    public List<Doctor> getDoctors() {
        return doctors;
    }

    // create a getter for patients
    public List<Patient> getPatients() {
        return patients;
    }
}
