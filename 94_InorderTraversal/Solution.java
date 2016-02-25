import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Solution s = new Solution();
        for (int i : s.inorderTraversal(new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null))))
            System.out.println(i);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> l = new LinkedList<>();
        if (root == null) return l;
        l.addAll(inorderTraversal(root.left));
        l.add(root.val);
        l.addAll(inorderTraversal(root.right));
        return l;
    }
}
