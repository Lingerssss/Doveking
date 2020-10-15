import java.util.ArrayList;
import java.util.List;

public class Leetcode401_二进制手表 {
    public List<String> readBinaryWatch(int num) {
        List<String> fi=new ArrayList<>();
        int[] hour=new int[]{
                1,2,4,8
        };
        int[] min=new int[]{
                1,2,4,8,16,32
        };
        boolean[] pb1=new boolean[4];
        boolean[] pb2=new boolean[6];





        int[] res=new int[2];
        dfs(hour,min,pb1,pb2,res,num,0,fi,0);
        return fi;
    }
    void dfs(int[] hour,int[] min,boolean[] pb1,boolean[] pb2,int[] res,int n,int count,List<String> fi,int index){
        //
        if(count==n){
            StringBuilder sb=new StringBuilder();
            sb.append(res[0]);
            sb.append(":");
            if(res[1]/10==0){
                sb.append(0);
                sb.append(res[1]);

            }
            else {
                sb.append(res[1]);
            }
            if(fi.contains(sb)==false){
                fi.add(sb.toString());
            }


            return;
        }


        //先添加小时
        for(int i=0;i<min.length;i++){
            if (pb2[i]==false&&res[1]+min[i]<=59) {
                pb2[i]=true;
                res[1]+=min[i];
                dfs(hour,min,pb1,pb2,res,n,count+1,fi,index+i);
                pb2[i]=false;
                res[1]-=min[i];
            }
        }
        for(int i=0;i<hour.length;i++) {
            if(pb1[i]==false&&res[0]+hour[i]<12) {
                pb1[i]=true;
                res[0] += hour[i];

                dfs(hour, min, pb1,pb2,res, n, count + 1, fi, index + i);
                pb1[i]=false;
                res[0] -= hour[i];
            }
        }




    }
}
