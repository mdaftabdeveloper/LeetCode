import java.util.Arrays;

public class LeetCode881 {
    public static void main(String[] args) {

    }

    public int numRescueBoats(int[] people, int limit) {

        Arrays.sort(people);

        int boat = 0;

        int start = 0;
        int end = people.length - 1;

        while (start <= end) {
            if (people[start] + people[end] <= limit) {
                boat++;
                start++;
                end--;
            } else {
                boat++;
                end--;
            }
        }
        return boat;
    }
}
