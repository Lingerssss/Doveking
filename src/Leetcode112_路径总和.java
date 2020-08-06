//import javax.swing.tree.TreeNode;
//import java.util.ArrayList;
//import java.util.List;
//
//public class Leetcode112_路径总和 {
//    public boolean hasPathSum(TreeNode root, int sum) {
//        List<List<Integer>> res =new ArrayList<>();
//        if(root==null){
//            return false;
//        }
//        List<Integer> chain =new ArrayList();
//        chain.add(root.val);
//        sum=sum-root.val;
//        dfs(root,sum,chain,res);
//        if (res.size()==0){
//            return false;
//        }
//        return true;
//
//    }
//    void dfs(TreeNode node,int sum,List<Integer> lt, List<List<Integer>> res){
//        //1.ending
//        if( node.left==null&&node.right==null){
//            if(sum==0||res.size()!=0){
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
//    }
//}
