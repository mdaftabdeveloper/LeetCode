public class LeetCode42 {
    public static void main(String[] args) {
        int height[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        System.out.println(new LeetCode42().trap(height));

    }

    public int trap(int[] height) {
        int store = 0;

        int length = height.length;

        int leftWall[] = new int[length];
        leftWall[0] = height[0];
        for (int i = 1; i < length; i++) {
            leftWall[i] = findMax(height[i], leftWall[i - 1]);
        }

        int rightWall[] = new int[length];
        rightWall[length - 1] = height[length - 1];
        for (int i = length - 2; i >= 0; i--) {
            rightWall[i] = findMax(height[i], rightWall[i + 1]);
        }

        for (int i = 0; i < height.length; i++) {
            int min = findMin(leftWall[i], rightWall[i]);
            store = store + min - height[i];
        }

        return store;

    }

    public int findMax(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public int findMin(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }

}
