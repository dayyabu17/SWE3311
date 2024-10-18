public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");


        //Question 1a
        /*Define a class Employee which name salary and hire date as attribute. 
        Implement a method to calculate the total annual bonus based on the salary.
        Create 2 instances of Employee class, calculate and print their bonuses. */
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();

        //Instance 1
        employee1.setName("Usman");
        employee1.setSalary(100000);
        employee1.setHireDate("8th December 2024");
        employee1.Display();


        employee2.setName("Dayyabu");
        employee2.setSalary(1000000000);
        employee2.setHireDate("10th Junary 1981");
        employee2.Display();
        
    }
}
