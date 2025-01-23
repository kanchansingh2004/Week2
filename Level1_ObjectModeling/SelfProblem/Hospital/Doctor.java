//Import the required packages for the class Doctor
import java.util.ArrayList;
import java.util.List;

//Create a class Doctor with name, specialization and patients as attributes
public class Doctor {
    private String name;
    private String specialization;
    private List<Patient> patients;

    // create a constructor with name and specialization as parameters
    public Doctor(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
        this.patients = new ArrayList<>();
    }

    // Method to consult a patient
    public void consult(Patient patient) {
        if (!patients.contains(patient)) {
            patients.add(patient);
            patient.addDoctor(this);
        }
        System.out.println("Doctor " + name + " is consulting Patient " + patient.getName());
    }

    // create a getter for name
    public String getName() {
        return name;
    }

    // create a getter for specialization
    public String getSpecialization() {
        return specialization;
    }

    // create a getter for patients
    public List<Patient> getPatients() {
        return patients;
    }
}
