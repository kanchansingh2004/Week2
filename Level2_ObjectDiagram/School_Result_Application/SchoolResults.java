//Import package Arraylist to use dynamic array
import java.util.ArrayList;

//Create a class SchoolResults to create objects of different class
public class SchoolResults {
    public static void main(String[] args) {
        //Create first object of student class passing student name and subject name while displaying details and grade.
        Student student1 = new Student(" Yung Kai");
        student1.addSubjects(new Subject("Maths", 78));
        student1.addSubjects(new Subject("Chemistry", 98));
        student1.display();
        student1.getGrade();

        //Create second object of student class passing student name and subject name while displaying details and grade.
        Student student2 = new Student(" Sakura Lee");
        student2.addSubjects(new Subject("Maths", 88));
        student2.addSubjects(new Subject("Chemistry", 80));
        student2.display();
        student2.getGrade();

    }
}

//Create student class to initialize student details.
class Student{

    //Create variables
    private String StudentName;
    private ArrayList <Subject> subjects;

    //Create constructor to store values for name and subject.
    Student(String StudentName){
        this.StudentName = StudentName;
        subjects = new ArrayList<>();
    }

    //Create addSubject method to add subject in array list
    public void addSubjects(Subject subject){
        subjects.add(subject);
    }

    //Display the details
    public void display(){
        System.out.println("Student name" + this.StudentName);
        for(Subject sub : subjects){
            System.out.println(sub.getName() + ":" + sub.getMarks());
        }
    }

    //Method to get the grades
    public void getGrade(){
        int total = 0;
        for(Subject mark : subjects){
            total += mark.getMarks();
        }
        //GradeCalculator object to get grade of a student.
        GradeCalculator gd = new GradeCalculator();
        System.out.println("Grade: " + gd.grade(total, subjects.size()));
    }
}

//Create subject class to initialize the subjects
class Subject{
    private String subjectName;
    private int marks;

    //Create subject constructor to initialize values
    Subject(String subjectName, int marks){
        this.subjectName = subjectName;
        this.marks = marks;
    }

    //Method to return the subject name
    public String getName(){
        return this.subjectName;
    }

    //Method to return the marks of subject
    public int getMarks(){
        return this.marks;
    }
}


//Create class GradeCalculator to calculate and return the grade.
class GradeCalculator{
    public char grade(int total, int totalSub){
        int avg = (total/totalSub)*100;
        if(avg>=80){
            return 'A';
        }
        else if(avg>=79){
            return 'B';
        }
        else if(avg>=69){
            return 'C';
        }
        else if(avg>=59){
            return 'D';
        }
        else{
            return 'E';
        }
    }
}