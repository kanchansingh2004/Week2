// Create a class called CompanyAndDepartments with a main method.
public class CompanyAndDepartments {
    public static void main(String[] args) {
        // Create some Company objects
        Company company1 = new Company("KPIT");
        Company company2 = new Company("Accenture");
        Company company3 = new Company("Capgemini");

        // Create some Customers objects
        Department department1 = new Department("Software Engineer");
        Department department2 = new Department("HR");
        Department department3 = new Department("Data Analyst");
        

        // Add Department to Company1
        company1.addDepartment(department1);
        company1.addDepartment(department2);
        company1.addDepartment(department3);
        
        // Add Department to Company2
        company2.addDepartment(department1);
        company2.addDepartment(department2);
        company2.addDepartment(department3);

        // Add Department to Company3
        company3.addDepartment(department1);
        company3.addDepartment(department2);
        company3.addDepartment(department3);


        
        //Add Employee to the Department
        department1.addEmployee(new Employee("Rain", "0725"));
        department2.addEmployee(new Employee("TaeHyung", "28937"));
        department2.addEmployee(new Employee("Jungkook", "9872"));
        department3.addEmployee(new Employee("Min Yoongi", "8763"));

        //Add Employee for comapny2
        company2.addEmployee(department3, "Min Seok","8767");

        // Display the Company Details
        company1.displayDepartments();
        company2.displayDepartments();
        company3.displayDepartments();

        //Display the Employees details
        department1.displayEmployees();
        department2.displayEmployees();
        department3.displayEmployees();
        
        
    }
}
