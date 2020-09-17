/*
import java.util.ArrayList;
import java.util.List;

public class Su_8_23 {
    int n=2,l=1,r=3;
    int sum=0;
    int count=0;
    public static int select(int[] a) {
        dfs(a,new ArrayList());
        return count;

    }
    static void dfs(int[] a,List chain){
        //
        if(chain.size()==a.length){
            if(sum%3==0){
                count++;
            }
            return;
        }
        for(int i=l;i<=r;i++){
            chain.add(i);
            dfs(a,chain);
            chain.remove(chain.size()-1);
        }
    }


}
*/
