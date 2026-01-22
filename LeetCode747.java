public class LeetCode747 {
    public static void main(String[] args) {
        int arr[] = { 3, 6, 4, 0 };
        int max = -1;
        int secondMax = -1;
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                secondMax = max;
                max = arr[i];
                index = i;
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }

        System.out.println(index);
        System.out.println(max);
        System.out.println(secondMax);
    }
}
