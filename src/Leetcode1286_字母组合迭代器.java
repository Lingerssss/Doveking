import java.util.ArrayList;
import java.util.List;

public class Leetcode1286_字母组合迭代器 {
    List<StringBuilder> res=new ArrayList<>();
    int index=0;
    public Leetcode1286_字母组合迭代器(String characters, int combinationLength) {
        char[] c=characters.toCharArray();
        boolean[] pb=new boolean[characters.length()];

        dfs(c,pb,combinationLength,new StringBuilder(),res);

    }

    public String next() {
        return res.get(index++).toString();

    }

    public boolean hasNext() {
        return index<res.size();

    }
    void dfs(char[]c, boolean[] pb,int length, StringBuilder sb,List<StringBuilder> res){
        //
        if(sb.length()==length){
            res.add(new StringBuilder(sb));
            return;
        }

        //
        for(int i=0;i<length;i++){
            if(pb[i]==false){
                pb[i]=true;
                sb.append(c[i]);
                dfs(c,pb,length,sb,res);
                pb[i]=false;
                sb.deleteCharAt(sb.length()-1);

            }

        }
    }
}

