import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Leetcode78_子集 {
    public List<List<Integer>> subsets(int[] p) {
        boolean[] pb = new boolean[p.length];
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> chain=new ArrayList<>();
        dfs(p,pb,chain,res);
        return res;
    }
    void dfs(int[] p,boolean[] pb,List<Integer> chain,List<List<Integer>> res){
        //
        List<Integer> temp=new ArrayList<>(chain);
        Collections.sort(temp);
        if(res.contains(temp)==false){
            res.add(new ArrayList<>(temp));
        }
        //这里不写return就超时
        else return;

        //
        for(int i=0;i<p.length;i++){
            if(pb[i]==false) {
                pb[i] = true;
                chain.add(p[i]);

                dfs(p, pb, chain, res);
                pb[i] = false;
                chain.remove(chain.size()-1);
            }
        }
    }
}
