/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
import java.util.*;

public class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> l = new LinkedList<Integer>();
        if (root == null)
            return l;
        l.add(root.val);
        if (root.left != null)
            l.addAll(preorderTraversal(root.left));
        if (root.right != null)
            l.addAll(preorderTraversal(root.right));
        return l;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        List<Integer> l = s.preorderTraversal(new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null)));
        for (Integer i : l) {
            System.out.println(i);
        }
    }
}
