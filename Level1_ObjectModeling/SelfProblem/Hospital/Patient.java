//Importing required packages for the class Patient 
import java.util.ArrayList;
import java.util.List;

//Create a class Patient with name, age and doctors as attributes
public class Patient {
    private String name;
    private int age;
    private List<Doctor> doctors;

    // create a constructor with name and age as parameters
    public Patient(String name, int age) {
        this.name = name;
        this.age = age;
        this.doctors = new ArrayList<>();
    }

    // Method to add a doctor
    public void addDoctor(Doctor doctor) {
        if (!doctors.contains(doctor)) {
            doctors.add(doctor);
        }
    }

    // create a getter for name
    public String getName() {
        return name;
    }

    // create a getter for age
    public int getAge() {
        return age;
    }

    // create a getter for doctors
    public List<Doctor> getDoctors() {
        return doctors;
    }
}
