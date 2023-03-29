import java.util.Scanner;
import java.util.Arrays;
public class ArraysInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i=0;i<5;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<5;i++){
            System.out.println(arr[i] + " ");
        }

        System.out.println(Arrays.toString(arr));
        String[] str = new String[5];

        for(int i=0;i<str.length;i++){
            str[i] = sc.next();
        }
        for (String s : str) {
            System.out.println(s);
        }

        System.out.println(Arrays.toString(str));



    }
}
