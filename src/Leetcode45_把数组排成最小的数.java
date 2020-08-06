import java.util.Arrays;

public class Leetcode45_把数组排成最小的数 {
    public String minNumber(int[] nums) {
        Arrays.sort(nums);
        StringBuilder res=new StringBuilder();
        process(nums,res);
        System.out.println(res);
        String result=res.toString();
        return result;

    }
    void process(int[] p,StringBuilder res){
        //1.ending
        if(res.length()==p.length){
            return;
        }
        //2.
        for(int i=0;i<p.length;i++) {
            res.append(p[i]);
            process(p, res);
        }

    }


}
