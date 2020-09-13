/*
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
//并没有将0计算在内，但一开始多算进去一个null正好抵消了
public class Leetcode357_计算各个位数不同的数字个数 {
    public int countNumbersWithUniqueDigits(int n) {
        if(n>10){
            return 0;
        }
        int[] p=new int[]{0,1,2,3,4,5,6,7,8,9};
        HashMap <Integer,Integer> hm=
        boolean[] pb=new boolean[10];

        int[] res=new int[1];
        dfs(n,p,pb,new ArrayList<>(),res);
        return res[0];


    }
    void dfs(int n,int[] p,boolean[] pb,List<Integer> chain,int[] res){
        //
        System.out.println(chain);
        res[0]++;
        if(chain.size()==n){
            return;
        }


        //
        for(int i=0;i<p.length;i++){
            if(pb[i]==false&&(p[i]!=0||chain.size()!=0)){
                pb[i]=true;
                chain.add(p[i]);
                dfs(n,p,pb,chain,res);
                pb[i]=false;
                chain.remove(chain.size()-1);
            }
        }

    }

}
*/
