import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class jj827_360 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int sum=0;
        int s=scanner.nextInt();
        //n人
        int n=scanner.nextInt();
        //选k
        int k=scanner.nextInt();
        int[] p=new int[n];
        for(int i=0;i<n;i++){
            p[i]=scanner.nextInt();
        }
        Arrays.sort(p);
        for(int i=n-1;i>n-k;i--){
            sum+=p[i];
        }
        System.out.println(sum);



        /*HashMap<Integer, Integer> hm=new HashMap();
        for(int i=0;i<n-1;i++){
            int s1=scanner.nextInt();
            int s2=scanner.nextInt();
            hm.put(s1,s2);
        }
        //boolean[] pb=new boolean[n];*/
    }
    void solve(int[] p){

    }









    /*public void dfs(int[] p, boolean[] pb, HashMap hm, int[] res, int index, int k){
        //

        if(index==k){
            if(res[0]>count){
                res[0]=count;
            }
            return;
        }
        //

        for(int i=0;i<k;i++){
            if(pb[i]==false){
                if(hm.containsKey(i)==true){
                    pb[hm.get(i)]=true;
                }

            }
        }


    }*/

}
