public class Solution {
    public int searchInsert(int[] nums, int target) {
        int l = 0, r = nums.length - 1, m = (l + r) / 2;
        if (target <= nums[l])
            return l;
        if (target > nums[r])
            return r + 1;
        while (true) {
            if (nums[m] == target)
                return m;
            else if (l == r || l + 1 == r)
                return r;
            else if (nums[m] < target) {
                l = m;
                m = (l + r) / 2;
            } else {
                r = m;
                m = (l + 2) / 2;
            }
            continue;
        }
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] a = new int[] {1,3,5,6}, b = new int[] {1};
        System.out.println(s.searchInsert(a,5) + " =? 2");
        System.out.println(s.searchInsert(a,2) + " =? 1");
        System.out.println(s.searchInsert(a,7) + " =? 4");
        System.out.println(s.searchInsert(a,0) + " =? 0");
        System.out.println(s.searchInsert(b, 2) + " =? 1");
        System.out.println(s.searchInsert(b, 1) + " =? 0");
        System.out.println(s.searchInsert(new int[] {1, 3, 5}, 1) + " =? 0");
    }
}
