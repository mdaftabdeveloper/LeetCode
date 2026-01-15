public class LeetCode74 {
    public static void main(String[] args) {
        int matrix[][] = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };
        System.out.println(new LeetCode74().searchMatrix(matrix, 60));
    }

    public boolean searchMatrix(int[][] matrix, int target) {

        int startRow = 0;
        int endRow = matrix.length - 1;
        int cols = matrix[0].length;

        while (startRow <= endRow) {
            int midRow = startRow + (endRow - startRow) / 2;

            if (target >= matrix[midRow][0] &&
                    target <= matrix[midRow][cols - 1]) {

                int startCol = 0;
                int endCol = cols - 1;

                while (startCol <= endCol) {
                    int midCol = startCol + (endCol - startCol) / 2;

                    if (matrix[midRow][midCol] == target) {
                        return true;
                    } else if (matrix[midRow][midCol] < target) {
                        startCol = midCol + 1;
                    } else {
                        endCol = midCol - 1;
                    }
                }
                return false;
            }

            else if (target < matrix[midRow][0]) {
                endRow = midRow - 1;
            } else {
                startRow = midRow + 1;
            }
        }
        return false;
    }
}
