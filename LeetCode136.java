public class LeetCode136 {
    public static void main(String[] args) {

    }

    public int singleNumber(int[] nums) {
        int uniqueNumber = 0;
        for (int i : nums) {
            uniqueNumber = uniqueNumber ^ i;
        }
        return uniqueNumber;
    }
}
