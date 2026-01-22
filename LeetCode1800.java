public class LeetCode1800 {
    public static void main(String[] args) {
        int nums[] = { 6, 10, 6 };
        System.out.println(new LeetCode1800().maxAscendingSum(nums));
    }

    public int maxAscendingSum(int[] nums) {
        int sum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] < nums[i]) {
                sum = sum + nums[i];
            } else {
                if (sum > maxSum) {
                    maxSum = sum;
                }
                sum = nums[i];
            }
        }
        if (sum > maxSum) {
            maxSum = sum;
        }

        return maxSum;
    }
}