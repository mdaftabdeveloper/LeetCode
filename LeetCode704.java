public class LeetCode704 {
    public static void main(String[] args) {
        int nums[] = { -1, 0, 3, 5, 9, 12 };
        System.out.println(new LeetCode704().search(nums, 9));
    }

    public int search(int[] nums, int target) {
        int index = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (target > nums[mid]) {
                start = mid + 1;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                index = mid;
                break;
            }
        }
        return index;
    }
}
