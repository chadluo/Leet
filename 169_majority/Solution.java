import java.util.*;

public class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> m = new TreeMap<>();
        int l = nums.length;
        for (int i : nums) {
            if (m.containsKey(i))
                m.replace(i, m.get(i), m.get(i) + 1);
            else
                m.put(i, 1);
        }
        for (int i : m.keySet())
            if (m.get(i) >= l/2)
                return i;
        return 0;
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.majorityElement(new int[] {1,2,3,4,5,6,7,7,7,7,7,7,7,7,7}));
        System.out.println(s.majorityElement(new int[] {3,2,3}));
    }
}
