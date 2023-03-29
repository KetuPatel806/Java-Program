import java.util.Scanner;

public class vedantCPP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Password = sc.nextLine();
        if(Password.length()>=8){
            System.out.println("Valid");
        }else{
            System.out.println("Not Valid");
        }
    }
}
