//Create class PersonMain to pass attributes of a person
public class PersonMain{
    public static void main(String[] args) {
        //Pass value and call method .
        Person person1 = new Person("Kanchan Singh",20);
        Person person2 = new Person(person1);

        //Method call to display the results.
        person1.display();
        person2.display();
    }
}
