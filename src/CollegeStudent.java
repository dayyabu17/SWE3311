public class CollegeStudent extends Student  {
    public String Major;
    public String year;

    public CollegeStudent(String name, String rollNo, String Major){
        super(name, rollNo);
        this.Major = Major;
    }
    public String getMajor(){
        return this.Major;
    }

}
