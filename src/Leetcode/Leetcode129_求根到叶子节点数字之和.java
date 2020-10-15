public class Leetcode129_求根到叶子节点数字之和 {
    public int sumNumbers(TreeNode root) {
        if(root==null){
            return 0;
        }
        int[] res=new int[1];
        dfs(root,root.val,res);
        return res[0];
    }
    void dfs(TreeNode node,int chain,int[] res){
        //1.ending
        if(node.left==null&&node.right==null){
            res[0]+=chain;
            return ;
        }
        //2.
        if(node.left!=null){
            dfs(node.left,chain*10+node.left.val,res);
        }
        if(node.right!=null){
            dfs(node.right,chain*10+node.right.val,res);
        }
    }
}
