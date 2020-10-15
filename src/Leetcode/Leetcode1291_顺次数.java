import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
//StringBuilder不能直接推整数！
//StringBuilder不能直接推整数！
//StringBuilder不能直接推整数！
//StringBuilder不能直接推整数！
//StringBuilder不能直接推整数！
//StringBuilder不能直接推整数！
//StringBuilder不能直接推整数！
//StringBuilder不能直接推整数！

//看清小于和小于等于





public class Leetcode1291_顺次数 {
    public List<Integer> sequentialDigits(int low, int high) {
        char[] p=new char[]{'1','2','3','4','5','6','7','8','9'};
        List<Integer> res= new ArrayList<>();
        int[] temp=new int[1];
        dfs(p,low,high,temp,new StringBuilder(),res);
        Collections.sort(res);
        return res;




    }
    void dfs(char[] p,int low ,int high,int[] temp,StringBuilder chain,List<Integer> res){
        //
        if(temp[0]>high){
            return;
        }
        //System.out.println("temp[0]qianbiande:  "+temp[0]);

        if(temp[0]<=high&&temp[0]>=low){
            res.add(Integer.parseInt(new StringBuilder(chain).toString()));

        }

        //

        for(int i=0;i<9;i++){

            if(chain.length()==0||((chain.length()>0&&chain.charAt(chain.length()-1)+1==p[i]))){
                chain.append(p[i]);

                temp[0]=temp[0]*10+p[i]-'0';
//                System.out.println("temp: "+temp[0]);
//                System.out.println("chain2: "+chain);

                dfs(p,low,high,temp,chain,res);
                chain.deleteCharAt(chain.length()-1);
                temp[0]=(temp[0]-i)/10;
            }
        }

    }
}
