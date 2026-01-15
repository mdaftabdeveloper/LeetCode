public class LeetCode162 {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 1, 3, 5, 6, 4 };

        System.out.println(new LeetCode162().findPeakElement(arr));
    }

    public int findPeakElement(int[] nums) {
        if (nums.length == 1) {
            return 0;
        }
        if (nums[0] > nums[1]) {
            return 0;
        }
        if (nums[nums.length - 1] > nums[nums.length - 2]) {
            return nums.length - 1;
        }

        int start = 1;
        int end = nums.length - 2;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid - 1] > nums[mid]) {
                end = mid - 1;
            } else if (nums[mid + 1] > nums[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
