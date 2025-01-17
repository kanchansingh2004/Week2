//Create class StudentReport for Student details.
public class StudentReport {
    public static void main(String args[]){
        //Create class objects
        Student student1 = new Student("Kanchan Singh","20", 99 );
        Student student2 = new Student("Prince Raj ","30", 10 );
        Student student3 = new Student("Viraj Kushwaha ","64", 10 );

        //Call class methods using object.
        student1.display();
        student2.display();
        student3.display();
    }
}
