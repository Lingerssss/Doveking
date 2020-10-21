import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 最大被3整除的数 {
    int ss=0;
    public String max(int[] p){
        boolean[] pb=new boolean[p.length];
        List<List<Integer>> res=new ArrayList<>();
        deep(p,pb,new ArrayList(),0,res);
        List ff=res.get(0);
        for(int i=1;i<res.size();i++){
            int index=0;
            int j=0;
            while(index<res.get(0).size()){
                int tt=res.get(j).get(index);
                if(res.get(i).get(index).intValue()<tt){
                    return res.get(j).toString();
                }
            }
        }
        return res.get(0).toString();
    }
    public void deep(int[] p,boolean[] pb,List ls,int tmp,List<List<Integer>>res){
        //
        System.out.println("ls: "+ls);
        if(ls.size()>p.length){
            return;
        }
        if(tmp>=ss&&tmp%3==0){
            ss=tmp;
            res.add(ls);

        }
        
        //
        for(int i=0;i<p.length;i++){
            if(false==pb[i]){
                pb[i]=true;
                tmp+=p[i];
                ls.add(p[i]);
                pb[i]=false;
                deep(p,pb,ls,tmp,res);
                ls.remove(ls.size()-1);
            }
        }
    }
}
