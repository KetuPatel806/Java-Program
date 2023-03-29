import java.util.ArrayList;

public class GFGSlidingWindow {
    public static void main(String[] args) {
        int[] arr = {1,2,3,7,5};
        ArrayList<Integer> ans = subarraySum(arr,5,12);
        System.out.println(ans);

    }
    public static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;
        int k = 0;
        for(int i=0;i<n;i++){
            sum += arr[i];
            if(sum == s){
                list.add(k+1);
                list.add(i+1);
                break;
            }else if(sum > s) {
                i = k;
                k++;
                sum = 0;
            }
        }
        if(list.size()==0){
            list.add(-1);
        }
        return list;
    }
}
