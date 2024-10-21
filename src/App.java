
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");


        //Question 1a
        /*Define a class Employee which name salary and hire date as attribute. 
        Implement a method to calculate the total annual bonus based on the salary.
        Create 2 instances of Employee class, calculate and print their bonuses. */

        // //check the Employee.java file for the base class
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


        CollegeStudent[] std;
        std = new CollegeStudent[4];
        
        std[0] = new CollegeStudent("Usman", "cst\\33", "Computer Science");
        std[1] = new CollegeStudent("Isa", "cst\\29", "Computer Science");
        std[2] = new CollegeStudent("musa", "cst\\22", "Computer Science");
        std[3] = new CollegeStudent("ope", "cst\\11", "Computer Science");
        
        for (int i = 0; i < std.length; i++) {
            if(std[i].getMajor().equals("Computer Science")){
                System.out.println("Name is " + std[i].getName());
            }
        }
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        Larger(a, b);

        sc.close();

        
    }

    private static void Larger(int a, int b){
        if(a>b){
            System.out.println(a +" is larger and " + b + " is smaller");
        }else{
            System.out.println(b +" is larger and " + a + " is smaller");
        }
    }
}
