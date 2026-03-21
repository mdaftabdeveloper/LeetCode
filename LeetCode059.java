public class LeetCode059 {
    public static void main(String[] args) {

    }

    public int[][] generateMatrix(int n) {

        int arr[][] = new int[n][n];

        int minRow = 0;
        int maxRow = n - 1;

        int minCol = 0;
        int maxCol = n - 1;

        int count = 1;

        while (count <= n * n) {
            // min row is fixed
            for (int col = minCol; col <= maxCol; col++) {
                arr[minRow][col] = count;
                count++;
            }
            // max col is fixed
            for (int row = minRow + 1; row <= maxRow; row++) {
                arr[row][maxCol] = count;
                count++;
            }
            // max row is fixed
            for (int col = maxCol - 1; col >= minCol; col--) {
                arr[maxRow][col] = count;
                count++;
            }
            // min col is fixed
            for (int row = maxRow - 1; row >= minRow + 1; row--) {
                arr[row][minCol] = count;
                count++;
            }

            minRow++;
            maxRow--;

            minCol++;
            maxCol--;
        }
        return arr;
    }
}
