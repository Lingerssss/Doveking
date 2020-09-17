import java.util.ArrayList;
import java.util.List;

public class Leetcode842_将数组拆分为斐波那契数列 {
    public List<Integer> splitIntoFibonacci(String S) {

        List<Integer> res=new ArrayList<>();
        if(S.length()<3){
            return res;
        }
        dfs(S,res);
        return res;

    }
    private void dfs(String S,List<Integer> res,int tmp_length){
        //
        if(tmp_length==S.length()){
            return;
        }
        //
        for(int i=0;i<S.length();i++){
            int temp_int=S.substring
            if(res.size()<=2||temp_int==res.get(res.size()-1)+res.get(res.size()-2)){
                res.add(temp_int);
                dfs(S,res,tmp_length+)
            }
        }


    }
}


