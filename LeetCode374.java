public class LeetCode374 {
    public static void main(String[] args) {

    }

    public int guessNumber(int n) {

        int start = 1;
        int end = n;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            int num = guess(mid);

            if (num == 0) {
                return mid;
            } else if (num == -1) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        return -1;
    }

    // API method
    int guess(int n) {
        return 0;
    }
}
