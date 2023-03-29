import java.sql.SQLOutput;

public class CountZero {
    public static void main(String[] args) {
        System.out.println(Zeros(20105034));
    }
    public static int Zeros(int n){
        return helper(n,0);
    }
    private static int helper(int n,int c){
        if(n == 0){
            return c;
        } else if (n % 10 == 0) {
            return helper(n/10,c+1);
        }else{
            return helper(n/10,c);
        }
    }
}
