public class LeetCode004 {
    public static void main(String[] args) {
        int arr1[] = { 1, 2 };
        int arr2[] = { 3, 4 };
        int arr3[] = new int[arr1.length + arr2.length];

        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        while (p1 < arr1.length && p2 < arr2.length) {
            if (arr1[p1] < arr2[p2]) {
                arr3[p3] = arr1[p1];
                p1++;
                p3++;
            } else if (arr2[p2] < arr1[p1] && p2 < arr2.length) {
                arr3[p3] = arr2[p2];
                p2++;
                p3++;
            }
        }

        while (p1 < arr1.length) {
            arr3[p3] = arr1[p1];
            p1++;
            p3++;
        }
        while (p2 < arr2.length) {
            arr3[p3] = arr2[p2];
            p2++;
            p3++;
        }
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }

        int mid = arr3.length / 2;
        System.out.println("Mid = " + mid);
        double median = 0;
        if (arr3.length % 2 == 0) {
            median = (arr3[mid] + arr3[mid - 1]) / 2.0;
        } else {
            median = arr3[mid];
        }
        System.out.println("median = " + median);

    }
}