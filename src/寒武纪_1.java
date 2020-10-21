import java.util.Arrays;

public class 寒武纪_1 {
    public int perfect(int n,int[] p){
        //判空
        int res=0;

        if(p==null||p.length<3){
            return 0;
        }
        Arrays.sort(p);


        for (int base=1;base<=9;base++) {
            int count=0;
            for(int i=0;i<p.length;i++){
                int tmp= (int) Math.pow(base,i);
                System.out.println("temp"+tmp);
                count+=Math.abs(tmp-p[i]);

            }

            System.out.println("count: "+count);
            if(count>res){
                res=count;
            }

        }
        return res;
    }


}
