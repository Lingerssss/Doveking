/*
import java.nio.charset.IllegalCharsetNameException;
import java.util.ArrayList;
import java.util.List;

public class Leetcode784_字母大小写全排列 {
    public List<String> letterCasePermutation(String S) {
        List<String> res=new ArrayList<>();

        char[] c=new char[S.length()];
        for(int i=0;i<S.length();i++){
            c[i]=S.charAt(i);
        }

        dfs();
        return res;


    }
    void dfs(char[] c, StringBuilder sb, List<String> res){
        //
        if(sb.length()==c.length){
            res.add(sb.toString());
        }
        //
        for(int i=0;i<c.length;i++){
            if(c[i]>'a'&&c[i]<'z'){
                sb.append(c[i]);


            }

        }

    }
}
*/
