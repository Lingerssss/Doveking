import java.util.ArrayList;
import java.util.List;

public class Leetcode5474_统计三元组 {
    public int countGoodTriplets(int[] p, int a, int b, int c) {
        int[] temp=new int[]{a,b,c};
        boolean[] pb = new boolean[p.length];
        int[] res = new int[1];
        dfs(0,p,pb,temp,new ArrayList<>(),res);
        return res[0];

    }
    void dfs(int index,int[] p,boolean[] pb,int[] temp,List<Integer> chain,int[] res){
        //
        if(chain.size()==3){
            if(abs(chain.get(0),chain.get(1))<=temp[0]
                    &&abs(chain.get(1),chain.get(2))<=temp[1]
                    &&abs(chain.get(0),chain.get(2))<=temp[2]
            ){
                res[0]++;
            }

            return;
        }
        //
        for(int i=index;i<p.length;i++){
            if(pb[i]==false){
                pb[i]=true;
                chain.add(p[i]);
                index++;

                dfs(index,p,pb,temp,chain,res);

                chain.remove(chain.size()-1);
                pb[i]=false;
            }
        }


    }
    int abs(int a,int b){
        if(a>=b){
            return a-b;
        }
        else return b-a;
    }
}
