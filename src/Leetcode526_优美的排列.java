import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.Iterator;

import java.util.List;

public class Leetcode526_优美的排列 {
    public int countArrangement(int N) {
        int[] p=new int[N];
        for(int i=0;i<N;i++){
            p[i]=i+1;
        }
        int[] res=new int[1];
        boolean[] pb=new boolean[N];
        dfs(p,pb,new ArrayList<>(),res);
        return res[0];


    }
    void dfs(int[] p,boolean[] pb,List<Integer> lt,int[] res){
        //
        System.out.println(lt);
        System.out.println("res: "+res[0]);
        if(lt.size()==p.length){
            res[0]++;
            System.out.println("res2: "+res[0]);
            return;
        }
        //
        for(int i=0;i<p.length;i++){
            //c就是1-N的具体值
            for (int j=0;j<p.length;j++) {
                int c=p[j];
                System.out.println("c: "+c);
                if(pb[j]==false){
                    if(c<(i+1)&&(i+1)%c==0){
                        pb[j]=true;
                        lt.add(c);
                        dfs(p,pb,lt,res);
                        pb[j]=false;
                        lt.remove(lt.size()-1);
                    }
                    if(c>=(i+1)&&c%(i+1)==0){
                        pb[j]=true;
                        lt.add(c);
                        dfs(p,pb,lt,res);
                        pb[j]=false;
                        lt.remove(lt.size()-1);

                    }
                }
            }

        }
    }
}
