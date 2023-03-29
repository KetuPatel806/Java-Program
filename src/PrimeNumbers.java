public class PrimeNumbers {
    public static void main(String[] args) {
        int n = 15;
        for (int i = 1; i <=n ; i++) {
            System.out.println(i +" "+ isPrime(i));
        }
    }
    public static boolean isPrime(int n){
        int c = 2;
        if(n<=1){
            return false;
        }
        while(c * c <= n){
            if(n % c ==0){
                return false;
            }
            c++;
        }
        return true;
    }
}
