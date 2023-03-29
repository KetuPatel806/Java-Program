import java.util.*;
public class MaxAndMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {2,300,399,344,1000};
        System.out.println(maxValue(arr));
        System.out.println(minValue(arr));
    }
    public static int maxValue(int[] arr) {
        int maxVal = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (maxVal < arr[i]) {
                maxVal = arr[i];

            }
        }
        return maxVal;
    }
    public static int minValue(int[] arr){
        int minVal = arr[0];
        for(int i=1;i< arr.length;i++){
            if(minVal>arr[i]){
                minVal = arr[i];
            }
        }
        return minVal;
    }
    }


