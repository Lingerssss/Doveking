import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

//同Leetcode_面试题0808

public class 剑指Offer38_字符串的排列 {
    public String[] permutation(String S) {
        char[] c =new char[S.length()];
        for(int i=0;i<S.length();i++){
            c[i]=S.charAt(i);
        }
        Map<Character,Integer> m=new HashMap<>();
        for(char i:c){
            m.put(i,m.containsKey(i)?m.get(i)+1:1);
        }
        int len=m.size();
        char[] p=new char[len];
        int[] pb=new int[len];
        int[] index=new int[1];
        m.forEach((k,v)->{
            p[index[0]]=k;
            pb[index[0]]=v;
            index[0]++;
        });

        List<String> res =new LinkedList<>();
        dfs(S.length(),p,pb,new String(),res);
        String[] ss= new String[res.size()];
        for(int i=0;i<res.size();i++){
            ss[i]=res.get(i);
        }
        return ss;


    }

    void dfs(int size,char[] p,int[] pb,String chain,List<String> res){
        //1.ending
        if(chain.length()==size){
            res.add(chain);
            return;
        }
        //2.selection
        for(int i=0;i<p.length;i++){
            char c = p[i];
            //2.1extract
            if(pb[i]>0){

                pb[i]--;
                dfs(size,p,pb,chain+c,res);
                pb[i]++;

            }

        }
    }
}
