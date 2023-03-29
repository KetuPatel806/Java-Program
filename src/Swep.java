import java.util.*;
public class Swep {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        swap(arr,1,3);
        System.out.println(Arrays.toString(arr));
    }
    public static void swap(int[] arr,int Index1,int Index3){
        int temp = arr[1];
        arr[1] = arr[3];
        arr[3] = temp;
    }
}
