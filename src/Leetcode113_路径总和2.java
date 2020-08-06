///**
// * Definition for a binary tree node.
// * public class TreeNode {
// *     int val;
// *     TreeNode left;
// *     TreeNode right;
// *     TreeNode(int x) { val = x; }
// * }
// */
//import javax.swing.tree.TreeNode;
//import java.util.ArrayList;
//import java.util.List;
//
//public class Leetcode113_路径总和2 {
//    public List<List<Integer>> pathSum(TreeNode root, int sum) {
//        List<List<Integer>> res =new ArrayList<>();
//        if(root==null){
//            return res;
//        }
//        List<Integer> chain =new ArrayList();
//        chain.add(root.val);
//        sum=sum-root.val;
//        dfs(root,sum,chain,res);
//        return res;
//    }
//    void dfs(TreeNode node,int sum,List<Integer> lt, List<List<Integer>> res){
//        //1.ending
//        if( node.left==null&&node.right==null){
//            if(sum==0){
//                res.add(new ArrayList(lt));
//            }
//            return;
//        }
//        //2.
//        if(node.left!=null){
//            lt.add(node.left.val);
//            dfs(node.left,sum-node.left.val,lt,res);
//            lt.remove(lt.size()-1);
//        }
//        if(node.right!=null){
//            lt.add(node.right.val);
//            dfs(node.right,sum-node.right.val,lt,res);
//            lt.remove(lt.size()-1);
//        }
//
//
//    }
//}
