public class LeetCode1394 {
    public static void main(String[] args) {

    }

    public int findLucky(int[] arr) {
        int lucky = 0;

        int maxLucky = 0;

        int frequency[] = calculateFrequency(arr);

        for (int i = 0; i < arr.length; i++) {

        }

        return maxLucky;
    }

    public int[] calculateFrequency(int[] arr) {

        // find min and max
        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        // create freq array based on range
        int size = max - min + 1;
        int freq[] = new int[size];

        // count frequency
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i] - min]++;
        }

        return freq;
    }

}
