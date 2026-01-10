public class LeetCode34 {
    public static void main(String[] args) {
        int nums[] = { 5, 7, 7, 8, 8, 10 };
        int result[] = new int[2];
        result = new LeetCode34().searchRange(nums, 8);
        // result[1] = new LeetCode34().searchRange(nums, 8);

        System.out.println(result[0]);
        System.out.println(result[1]);
    }

    public int[] searchRange(int[] nums, int target) {
        int result[] = new int[2];
        result[0] = firstFind(nums, target);
        result[1] = secondFind(nums, target);

        return result;
    }

    public int firstFind(int[] nums, int target) {
        int result = -1;

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                result = mid;
                end = mid - 1;
            }
        }
        return result;
    }

    // int nums[] = { 5, 7, 7, 8, 8, 10 };

    public int secondFind(int[] nums, int target) {
        int result = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                result = mid;
                start = mid + 1;
            }
        }
        return result;
    }
}
