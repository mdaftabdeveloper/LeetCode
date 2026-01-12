public class LeetCode1539 {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 7, 11 };
        int k = 5;
        System.out.println(new LeetCode1539().findKthPositive(arr, k));
    }

    public int findKthPositive(int[] arr, int k) {
        int current = 1;
        int i = 0;

        while (k > 0) {
            if (i < arr.length && arr[i] == current) {
                i++;
            } else {
                k--;
                if (k == 0)
                    return current;
            }
            current++;
        }
        return -1;
    }
}
