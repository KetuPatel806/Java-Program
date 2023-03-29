package OOPS.CollegeTasks;

public class Student_Details {
    String Name;
    String Branch;
    String Degree;
    int Enrollment_No;
    String University;
    int Branch_code;
    int Age;
    double SPI;
    int Marks;

    public String Student_details() {
        return ("Student Name is " + this.Name + " and Age is " + this.Age +" Persuing Study in " +
                this.Degree + " and University is " + this.University + " His Enrollment Number is " + this.Enrollment_No);
    }

    public void Student_branch(String Branch,int Branch_code) {
        this.Branch = Branch;
        this.Branch_code = Branch_code;
        System.out.println("Student is Study in " + Branch + " And Branch Code is " + Branch_code);
    }

    public void Student_Performance(int Marks , Double SPI) {
        this.Marks = Marks;
        this.SPI = SPI;
        System.out.println("Student's Marks Is " + Marks + " and " + "Current Sem SPI is " + SPI);
    }

    public static void main(String[] args) {
        Student_Details Student = new Student_Details();
        Student.Name = "Ketu";
        Student.Age = 19;
        Student.Degree = "B.tech";
        Student.University = "GTU";
        Student.Enrollment_No = 6005;
        System.out.println(Student.Student_details());
        Student.Student_branch("Information Technology",16);
        Student.Student_Performance(89,9.8);
    }
}
