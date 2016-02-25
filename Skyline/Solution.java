import java.util.*;

public class Solution {
    public List<int[]> getSkyline(int[][] buildings) {
        // building :: L -> R -> H
        int M = 0;
        for (int[] building : buildings) {
            if (M < building[1])
                M = building[1];
        }

        System.out.println("M" + (M == Integer.MAX_VALUE ? " == " : " != ") + Integer.MAX_VALUE);

        Vector<Integer> heights = new Vector<>(M);

        for (int[] building : buildings) {
            for (int i = building[0]; i < building[1]; i++) {
                if (heights.get(i) < building[2])
                    heights.add(i, building[2]);
            }
        }

        List<int[]> list = new LinkedList<>();
        for (int i = 1; i < M; i++) {
            if (heights.get(i) != heights.get(i - 1)) {
                list.add(new int[]{i, heights.get(i)});
            }
        }
        return list;
    }

    public static void main(String[] args) {
        Solution m = new Solution();
        for (int[] i : m.getSkyline(new int[][]{{2, 9, 10}, {3, 7, 15}, {5, 12, 12}, {15, 20, 10}, {19, 24, 8}, {0, 2147483647, 2147483647}}))
            System.out.println("{" + i[0] + ", " + i[1] + "}");
    }
}
