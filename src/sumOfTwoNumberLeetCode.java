import java.util.Arrays;

public class sumOfTwoNumberLeetCode {
    public static void main(String[] args) {
        int[] arr ={1,2,-1,3};
        int target = 6;
        System.out.println(arr.length);
        int[] ans = sumOfTwoNumbers(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] sumOfTwoNumbers(int[] arr , int target){
        for(int i=0;i<arr.length;i++){
            if(target == arr[i] + arr[arr.length-i-1]){
                return new int[]{i,arr.length-i-1};
            }
        }
        return new int[]{-1,-1};
    }

}
