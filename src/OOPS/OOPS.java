package OOPS;

public class OOPS {
    public static void main(String[] args) {
        Student ketu = new Student();
        System.out.println(ketu.Age);
        System.out.println(ketu.Marks);

    }

}
class Student{
    int Age;
    String name;
    int Marks;
    Student(){
        this.Age = 32;
        this.name = "KEtu Patel";
        this.Marks = 89;
    }
    }