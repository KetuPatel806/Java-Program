package BinarySearch;

public class AsceAndDesceArraysBinarySearch {
    public static void main(String[] args) {
        int[] arr = {50,34,10,9,6,3,1};
        int target = 6;
        int ans = orderAgnosticBS(arr,target);
        System.out.println(ans);

    }
    public static int orderAgnosticBS(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        //if ascending than going in line-19 and run ascending code
        //if descending than going in line-28 and run descending code
        boolean isAsc = arr[start]<arr[end];
        // start always greater than end
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == target){
                return mid;
            }
            if(isAsc){
                //target is left side of mid position
                if(target < arr[mid]){
                    end = mid - 1;
                }
                //target is right side of mid position
                else if(target > arr[mid]){
                    start = mid + 1;
                }
            }
            else{
                // target is left side of mid position
                if(target > arr[mid]){
                    end = mid - 1;
                }
                //target is right side of mid position
                else if(target < arr[mid]){
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
