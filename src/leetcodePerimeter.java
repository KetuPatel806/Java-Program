import java.lang.reflect.Array;
import java.util.Arrays;

public class leetcodePerimeter {
    public static void main(String[] args) {
        int[] nums = {1,2,1};
        System.out.println(largestPerimeter(nums));
    }
    public static int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int m=nums.length;
        for (int i = m - 1; i > 1; --i)
            if (nums[i] < nums[i - 1] + nums[i - 2])
                return nums[i] + nums[i - 1] + nums[i - 2];
        return 0;
    }
}
