public class LeetCode334 {
    public static void main(String[] args) {
        int arr[] = { 1, 2 };
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        boolean result = false;
        for (int n : arr) {
            if (n <= first) {
                first = n;
            } else if (n <= second) {
                second = n;
            } else {
                result = true;
            }
        }

        System.out.println(result);
    }
}
