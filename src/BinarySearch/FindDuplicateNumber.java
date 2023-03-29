package BinarySearch;

public class FindDuplicateNumber {
    public static void main(String[] args) {
        int[] nums = {2,4,5,7,5,4,2};
        System.out.println(uniqueNumber(nums));
    }
    public static int uniqueNumber(int[] nums){
        int unique = 0;
        for(int n=0;n<nums.length;n++){
            unique ^= n;
        }
        return unique;
    }
}
