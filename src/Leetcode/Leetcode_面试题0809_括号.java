import java.util.ArrayList;
import java.util.List;
//和22有几把区别？

public class Leetcode_面试题0809_括号 {
    public List<String> generateParenthesis(int n) {
        char[] p=new char[]{'(',')'};
        int[] pb=new int[]{n,n};
        List<String> res = new ArrayList<>();
        dfs(n,p,pb,new String(),res);
        System.out.println(res);
        return res;
    }
    void dfs(int n,char[] p, int[] pb, String str, List<String> res){
        //1.ending
        if(str.length()==2*n){
            res.add(str);
            return;
        }
        //2.Selection
        if(pb[0]>0){
            pb[0]--;
            dfs(n,p,pb,str+p[0],res);
            pb[0]++;
        }
        if(pb[1]>0&&pb[1]>pb[0]){
            pb[1]--;
            dfs(n,p,pb,str+p[1],res);
            pb[1]++;
        }
    }
}
