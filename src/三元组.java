
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 三元组 {
    /*public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] p=new int[n];
        for(int i=0;i<p.length;i++){
            p[i]=sc.nextInt();
        }
        System.out.println(three(p));
    }*/






    public int three(int[] p){
        int[] res=new int[2];
        dfs(p,0,new ArrayList<>(),res);
        //System.out.println(res[0]);
        return res[0];
    }
    public void dfs(int[] p, int index, List<Integer> chain,int[] res){
        //
//        if(chain.size()==3){
        if(res[1]==3){
            res[0]++;
            return;
        }
        //
        for(int i=index;i<p.length;i++){
            if(res[1]==0||p[i]>=chain.get(res[1]-1)){

                chain.add(p[i]);
                res[1]++;
                System.out.println("chian: "+chain);

                dfs(p,i+1,chain,res);
                res[1]--;

                chain.remove(res[1]);
            }
        }

    }
}
