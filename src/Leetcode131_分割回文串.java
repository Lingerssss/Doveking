import java.util.ArrayList;
import java.util.List;

public class Leetcode131_分割回文串 {
    public List<List<String>> partition(String s) {
        List<List<String>> res=new ArrayList<>();
        dfs(s,0,new ArrayList<>(),res);
        System.out.println(res);
        return res;

    }
    void dfs(String s,int index,List<String> chain,List<List<String>> res){
        //ending
        if(index>s.length()){

            return;

        }
        if(res.contains(chain)==false){
            List<String> temp=new ArrayList(chain);
            res.add(temp);
        }
        //
        for(int i=0;i<s.length();i++){
            if(index+i<s.length()){
                String sssss=s.substring(index,index+i);
                System.out.println(sssss);
                if(sssss.length()!=0){

                    if(huiwenchuan(s.substring(index,index+i))){
                        if (chain.contains(sssss )== false) {
                            chain.add(s.substring(index,index+i));
                            dfs(s,index+1,chain,res);

                        }

                    }
                }
            }
            else continue;


        }
    }
    boolean huiwenchuan(String s){
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-1-i)){
                return false;
            }
        }
        return true;

    }



}
