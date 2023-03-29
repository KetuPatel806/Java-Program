package BinarySearch;

public class AmazonInfinite {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 48, 64, 90, 98, 100, 500, 680};
        int target = 64;
        System.out.println(ans(arr,target));
    }
        public static int ans(int[] arr , int target) {
            int start = 0;
            int end = 1;
            while (target > arr[end]) {
                int temp = end + 1;
                //old end value = old end + sizeof array
                end = end + (end - start + 1)*2;
                start = temp;
            }
            return binarySearch(arr, target, start, end);
        }
    public static int binarySearch(int[] arr , int target,int start,int end){


        while(start <= end){
            int mid = start + (end - start)/2;
            if(target < arr[mid]){
                end = mid -1;
            } else if (target > arr[mid] ) {
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
