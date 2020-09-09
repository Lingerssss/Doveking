import java.util.ArrayList;
import java.util.List;

public class Leetcode1291_顺次数 {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> res= new ArrayList<>();
        int[] temp=new int[1];
        dfs(low,high,temp,new StringBuilder(),res);



        return res;
    }
    void dfs(int low ,int high,int[] temp,StringBuilder chain,List<Integer> res){
        //
        System.out.println(chain);
        if(temp[0]<high&&temp[0]>low){
            res.add(1);
        }

        //

        for(int i=1;i<=9;i++){
            if(chain.length()==0||(chain.length()>0&&chain.charAt(chain.length()-1)+1==i)){
                chain.append(i);
                temp[0]=temp[0]*10+i;
                System.out.println(temp[0]);
                dfs(low,high,temp,chain,res);
                chain.deleteCharAt(chain.length()-1);
                temp[0]=(temp[0]-i)/10;
            }
        }

    }
}
