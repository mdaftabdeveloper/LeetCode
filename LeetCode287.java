public class LeetCode287 {
    public static void main(String[] args) {

    }

    public int findDuplicate(int[] nums) {

        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            int element = nums[i];
            element = Math.abs(element);
            if (nums[element] > 0) {
                nums[element] = nums[element] * -1;
            } else {
                res = element;
                break;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Math.abs(nums[i]);
        }
        return res;
    }
}
