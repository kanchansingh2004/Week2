//Create class Student for Student details
public class Student {
    String name;
    String rollNumber;
    int marks;
    char grade;
    //Create constructor for input data
    Student(String name, String rollNumber, int marks){
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    //Create a method to calculate the grade
    public void calculateGrade(){
        // Determine the grade based on the marks
        if (marks >= 80) {
            this.grade = 'A'; // Assign grade 'A' for marks >= 80
        } else if (marks >= 70) {
            this.grade = 'B'; // Assign grade 'B' for marks >= 70
        } else if (marks >= 60) {
            this.grade = 'C'; // Assign grade 'C' for marks >= 60
        } else if (marks >= 50) {
            this.grade = 'D'; // Assign grade 'D' for marks >= 50
        } else if (marks >= 40) {
            this.grade = 'E'; // Assign grade 'E' for marks >= 40
        } else {
            this.grade = 'R'; // Assign grade 'R' for marks < 40 (Fail)
        }
    }

    //Create a display method to show data..
    void display(){
        calculateGrade();
        System.out.println("name:" + name);
        System.out.println("marks:" + marks);
        System.out.println("rollNumber:" + rollNumber);
        System.out.println("grade:" + grade);
    }
}
