public class LeetCode11 {
    public static void main(String[] args) {
        int arr[] = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };

        int start = 0;
        int end = arr.length - 1;
        int previousVolume = 0;
        int volume = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[start] < arr[end]) {
                volume = arr[start] * (end - start);
                start++;
            } else {
                volume = arr[end] * (end - start);
                end--;
            }
            if (previousVolume < volume) {
                previousVolume = volume;
            }
        }
        System.out.println(previousVolume);
    }
}
