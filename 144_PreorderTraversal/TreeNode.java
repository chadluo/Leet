public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
    TreeNode(int x, TreeNode l, TreeNode r) {
        this.val = x;
        this.left = l;
        this.right = r;
    }
}
