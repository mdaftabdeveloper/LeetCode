public class FrequencyCount {
    public static void main(String[] args) {
        int arr[] = { 12, 31, 12, 51, 13, 12, 17 };

        int freq[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            int element = arr[i];
            if (element == arr[i]) {
                count++;
            }
            freq[i] = count;
        }

        for (int i = 0; i < freq.length; i++) {
            System.out.println(freq[i]);
        }
    }
}
