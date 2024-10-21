public class Employee implements sortable {
    public String name;
    public float salary;
    public String hireDate;

    public void sort(){
        //implenating sort
    }


    public Employee(){
        this.name = "Random Name";
        this.salary = 100000;
        this.hireDate = "Random Date";

    }
    public void setName(String name){
        this.name=name;
    }
    public void setHireDate(String hireDate){
        this.hireDate=hireDate;
    }
    public void setSalary(float salary){
        this.salary = salary;
    }
    
    public float calAnnualBonus(){
        return  salary +(salary * 0.11f);
    }

    public void Display(){
        System.out.println("The name of the employee is " + this.name);
        System.out.println("His annual Salary is " + this.salary);
        System.out.println("He was hired on " + this.hireDate);
        System.out.println("His Anuual Bonus is " + calAnnualBonus());
    }
}
