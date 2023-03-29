import java.util.Scanner;
public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        boolean ans = perfectNumber(a);
        System.out.println(ans);

    }
    public static boolean perfectNumber(int a){
        int sum = 0;
        int original = a;
        while(a>0){
            int reminder = a % 10;
            a /= 10;
            sum = sum + reminder*reminder*reminder;

        }
        return sum == original;
    }
}
