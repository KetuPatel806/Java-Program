package BinarySearch;

public class CellingAndFloorNumber {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 16;
        int ans = CellingNumber(arr,target);
        System.out.println(ans);
        int target2 = 3;
        int ans2 = FloorNumber(arr,target2);
        System.out.println(ans2);

    }
    public static int CellingNumber(int[] arr , int target){
        //Celling Number is That  Number which Smallest Number greater than Target element
        int start = 0;
        int end = arr.length-1;

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
        return start;
    }
    public static int FloorNumber(int[] arr , int target){
        //Floor Number is That Number Which Greatest Number Less Than Target Element
        int start = 0;
        int end = arr.length-1;

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
        return end;
    }
}
