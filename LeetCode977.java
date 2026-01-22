public class LeetCode977 {
    public static void main(String[] args) {
        int arr[] = { -4, -1, 0, 3, 10 };

        int result[] = new int[arr.length];

        int start = 0;
        int end = arr.length - 1;

        int pointer = result.length - 1;
        while (start != end) {
            if (arr[start] * arr[start] > arr[end] * arr[end]) {
                result[pointer] = arr[start] * arr[start];
                start++;
                pointer--;
            } else {
                result[pointer] = arr[end] * arr[end];
                end--;
                pointer--;
            }
        }
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
