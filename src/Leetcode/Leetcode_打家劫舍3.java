/*
package Leetcode;

public class Leetcode_打家劫舍3 {
    public int rob(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int[] res = new int[1];
        dfs(root, root.val, res);
        return res[0];

    }

    void dfs(TreeNode node, int chain, int[] res) {
        //1.ending
        if (node.left == null && node.right == null) {
            if (chain > res[0]) {
                res[0] = chain;
            }
            ;
            return;
        }
        //2.
        if (node.left != null) {
            dfs(node.left, chain + node.left.val, res);
        }
        if (node.right != null) {
            dfs(node.right, chain + node.right.val, res);
        }

    }

}

*/
