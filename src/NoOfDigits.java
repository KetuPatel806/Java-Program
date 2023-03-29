public class NoOfDigits {
    public static void main(String[] args) {
     int number = 10;
     int base = 2;
     int digit = (int)(Math.log(number)/(Math.log(base)))+1;
        System.out.println(digit);
    }
}
