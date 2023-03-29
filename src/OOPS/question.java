package OOPS;

public class question {
    static int a = 5;
    static int  b;
     static{
         System.out.println("I am i n StaticBlock");
         b = a * 5;
     }

    public static void main(String[] args) {
        question obj = new question();
        System.out.println(question.a + " " + question.b);
    }
}
