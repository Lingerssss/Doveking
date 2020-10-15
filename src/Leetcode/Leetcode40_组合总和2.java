import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Leetcode40_组合总和2 {
    public List<List<Integer>> combinationSum2(int[] p, int target) {
        List<List<Integer>> res=new ArrayList<>();
        boolean[] pb=new boolean[p.length];
        dfs(p, pb,target,new ArrayList(),res);
        System.out.println(res);
        return res;
    }
    void dfs(int[] p,boolean pb[],int target,List<Integer> lt,List<List<Integer>> res){
        //1.ending
        int s= sum(lt);
        if(s>=target){
            if(s==target){
                List<Integer> temp=new ArrayList<>(lt);
                Collections.sort(temp);
                if(res.contains(temp)==false){
                    res.add(temp);
                }
            }
            return;
        }
        //2.selection
        for(int i=0;i<p.length;i++){
            if (pb[i]==false) {
                int c=p[i];
                pb[i]=true;
                lt.add(c);
//            System.out.println("lt: "+lt);
//            System.out.println("res: "+res);

                dfs(p,pb,target,lt,res);
                pb[i]=false;
                lt.remove(lt.size()-1);
            }
//            System.out.println("ltaaaa: "+lt);
        }
    }
    public int sum(List<Integer> lt){
        int res=0;
        for(int i:lt){
            res+=i;
        }
        return res;
    }
}
