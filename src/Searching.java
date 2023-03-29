import java.util.*;
public class Searching {
    public static void main(String[] args) {
        int[] arr ={2,33,56,756,89,59,74,43,-1,-34,6};
        int ans = linearSearching(arr,-1);
        System.out.println(ans);
        int ans2 = linearSearching2(arr,43,4,7);
        System.out.println(ans2);
        int[][] str = {
                {1,3,45,65},
                {2,5,6},
                {12,56,32,76,600},
                {37,67,35,60}
        };
        int target3 =76;
        int[] ans3 = Search(str,target3);
        System.out.println(Arrays.toString(ans3));
    }
    public static int linearSearching(int[] arr,int target){
        if(arr.length == 0){
            return -1;
        }
        for(int index=0;index<arr.length;index++){
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
        return -1;

    }
    public static int linearSearching2(int[] arr,int target,int start,int end) {
        if (arr.length == 0) {
            return -1;
        }
        for (int index = start; index <= end; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        return -1;
    }
    public static int[] Search(int[][] str,int target3){
        for(int i=0;i< str.length;i++){
            for(int j=0;j<str[i].length;j++){
                if(str[i][j] == target3){
                    return new int[]{i,j};
                }
            }

        }
        return new int[]{-1,-1};
    }
    }
