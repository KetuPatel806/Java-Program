import java.util.Arrays;

public class pairGivenDiff {
    public static void main(String[] args) {
        int arr[] = {5, 20, 3, 2, 5, 80};
        int k = 78;

        System.out.println(Arrays.toString(pair(arr,k)));
    }
    static int[] pair(int[] arr,int k){
        Arrays.sort(arr);
        for(int i=0;i< arr.length;i++){
            for(int j=arr.length-1;j>=0;j--){
                if(arr[j] - arr[i] == k){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
