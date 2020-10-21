package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode77_组合 {
    //    int l;
//    public List<List<Integer>> combine(int n, int k) {
//        l=k;
//        int[] p=new int[n];
//        for(int i=0;i<n;i++){
//            p[i]=i+1;
//        }
//        boolean[] pb=new boolean[n];
//        List<List<Integer>> res=new ArrayList<>();
//        List<Integer> chain =new ArrayList<>();
//        dfs(p,pb,k,l,chain,res);
//        System.out.println(res);
//        return res;
//    }
//    void dfs(int[] p,boolean[] pb, int k, int l,List<Integer> chain,List<List<Integer>> res){
//        //
//        if(chain.size()==l){
//                res.add(new ArrayList<>(chain));
//            return;
//        }
//        //
//        for(int i=0;i<p.length;i++){
//            int c=p[i];
//            if(pb[i]==false&&c>chain.size()){
//                pb[i]=true;
//                chain.add(c);
//                dfs(p,pb,l,k-1,chain,res);
//                pb[i]=false;
//                chain.remove(chain.size()-1);
//            }
//
//        }
//
//    }
    List<List<Integer>> list = new ArrayList<>();
    int count;

    public List<List<Integer>> combine(int n, int k) {
        if (k == 0) {
            return list;
        }
        count = k;
        ArrayList<Integer> chain = new ArrayList<>();
        backstrack(n, 1, k, chain);
        return list;

    }

    public void backstrack(int num, int index, int k, ArrayList<Integer> chain) {
        if (chain.size() == count) {
            list.add(new ArrayList(chain));
            return;
        }
        if (k > 0) {
            for (int i = index; i <= num; i++) {
                chain.add(i);
                backstrack(num, i + 1, k - 1, chain);
                chain.remove(chain.size() - 1);
            }
        }
    }


//public List<List<Integer>> combine(int n, int k) {
//    boolean[] pb=new boolean[n];
//    List<List<Integer>> res=new ArrayList<>();
//    List<Integer> chain =new ArrayList<>();
//    dfs(pb,n,k,chain,res);
//    return res;
//}
//    void dfs(boolean[] pb, int n,int k, List<Integer> chain,List<List<Integer>> res){
//        //
//        if(chain.size()==k){
//            List<Integer> chain= new ArrayList<>(chain);
//            Collections.sort(chain);
//            if(res.contains(chain)==false){
//                res.add(new ArrayList<>(chain));
//            }
//
//            return;
//        }
//        //
//        for(int i=0;i<n;i++){
//            if(chain.size()>0&&i<chain.get(0)){
//                return;
//            }
//            if(pb[i]==false){
//                pb[i]=true;
//                chain.add(i+1);
//                System.out.println(chain);
//                dfs(pb,n,k,chain,res);
//                pb[i]=false;
//                chain.remove(chain.size()-1);
//            }
//
//        }
//
//    }
}
