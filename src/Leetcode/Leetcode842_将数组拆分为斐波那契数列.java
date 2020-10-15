import java.util.ArrayList;
import java.util.List;

public class Leetcode842_将数组拆分为斐波那契数列 {
    public List<Integer> splitIntoFibonacci(String S) {

        List<Integer> res=new ArrayList<>();
        if(S.length()<3){
            return res;
        }
        dfs(S,0,res);
        System.out.println(res);
        return res;

    }
    private void dfs(String S,int index,List<Integer> res){
        //
        if(index==S.length()){
            return;
        }
        //
        for(int i=1;i<=S.length();i++){
            if(index+i<S.length()){
                String tmp_String = S.substring(index, index + i);
                if (res.size() <= 2 || Integer.parseInt(tmp_String) == res.get(res.size() - 1)+res.get(res.size() - 2)) {
                    res.add(Integer.parseInt(tmp_String));
                    dfs(S, index + 1, res);
                }

            }
        }


    }
}


