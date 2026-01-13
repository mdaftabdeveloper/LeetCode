public class LeetCode724 {
    public static void main(String[] args) {

    }

    public int pivotIndex(int[] nums) {
        int sum = 0;
        for (int i : nums) {
            sum = sum + i;
        }
        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (leftSum == (sum - leftSum - nums[i])) {
                return i;
            }
            leftSum = leftSum + nums[i];
        }
        return -1;
    }
}
