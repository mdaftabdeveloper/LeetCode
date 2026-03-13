import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class LeetCode1046 {
    public static void main(String[] args) {

    }

    public int lastStoneWeight(int[] stones) {

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        // Collections.reverseOrder(pq);

        for (int stone : stones) {
            pq.add(stone);
        }

        while (pq.size() > 1) {

            int max = pq.remove();
            int secondMax = pq.remove();

            int newStone = max - secondMax;

            if (newStone != 0) {
                pq.add(newStone);
            }

        }
        if (pq.size() == 0) {
            return 0;
        } else {
            return pq.remove();
        }
    }
}
