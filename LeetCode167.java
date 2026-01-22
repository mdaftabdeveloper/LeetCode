public class LeetCode167 {
    public static void main(String[] args) {
        int arr[] = { 2, 7, 11, 15 };
        int target = 26;

        int result[] = new int[2];
        int start = 0;
        int end = arr.length - 1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[start] + arr[end] < target) {
                start++;
            } else if (arr[start] + arr[end] > target) {
                end--;
            } else {
                start++;
                end++;
                result[0] = start;
                result[1] = end;
                break;
            }
        }
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
