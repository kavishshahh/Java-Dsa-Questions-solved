import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int target = 5;
        System.out.println(nums.length);
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]){
                    return new int[] {i, j};
                }
            }
        }
        return null;
    }
}
