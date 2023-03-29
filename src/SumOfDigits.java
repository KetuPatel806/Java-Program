public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(SumNumber(1342));
        System.out.println(ProductOfNum(1342));
    }


    public static int SumNumber(int n) {
        if(n ==0){
            return 0;
        }
        return n%10 + SumNumber(n/10);
    }
    public static int ProductOfNum(int n) {
        if(n ==0){
            return 1;
        }
        return n%10 * ProductOfNum(n/10);
    }
}
