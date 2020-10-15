import java.util.*;

public class Leetcode90_子集2 {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Map<Integer,Integer> m=new HashMap<>();
        for(int i:nums){
            m.put(i,m.containsKey(i)?m.get(i)+1:1);
        }
        int len=m.size();
        int[] p=new int[len];
        int[] pb=new int[len];
        int[] index=new int[1];
        m.forEach((k,v)->{
            p[index[0]]=k;
            pb[index[0]]=v;
            index[0]++;
        });
        List<List<Integer>> res=new ArrayList<>();
        dfs(0,p,pb,new ArrayList<Integer>(),res);

        return res;
    }
    void dfs(int index,int[] p,int[] pb,List<Integer> chain,List<List<Integer>> res){
        if(res.contains(chain)==false){
            res.add(new ArrayList<>(chain));
        }
        else return;
        //这里不写return就超时
        for(int i=index;i<p.length;i++){
            if(pb[i]>0) {
                pb[i]--;
                chain.add(p[i]);
                dfs(i,p, pb, chain, res);
                pb[i]++;
                chain.remove(chain.size()-1);
            }
        }
    }
}

