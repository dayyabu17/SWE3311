public class Student implements sortable{
    private String name;
    private String rollNo;
    public char[] grade;

    public Student(String name, String rollNo){
        this.name =name;
        this.rollNo = rollNo;
    }
    public String getName(){
        return name;
    }
    public String getRollNO(){
        return rollNo;
    }
    public void sort(){
        //implementation of sort
    }
}
