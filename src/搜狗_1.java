import java.util.Arrays;

public class 搜狗_1 {
    public int numberofprize (int a, int b, int c) {
        // write code here
        int count=0;
        int[] p=new int[]{a,b,c};
        Arrays.sort(p);
        for(int i:p){
            System.out.println(i);
        }
        count=p[0];
        int temp=p[0];
        /*if(p[0]==0&&p[1]==0){
            return p[2]/5;
        }*/
        for(int i=0;i<3;i++){
            p[i]=p[i]-temp;

        }

        for(int i:p){
            System.out.println(i);
        }


        temp=p[1];
        //删减第二次
        for(int i=1;i<3;i++){
            p[i]=p[i]-temp;
        }
        for(int i:p){
            System.out.println(i);
        }
        if (temp % 2 == 0) {
            count=count+temp/2;
            temp=p[2];
        }
        System.out.println("temp: "+temp);
        if(temp%2!=0){
            count=count+temp/2;
            temp=p[2]+4;
        }

        count=count+temp/5;

        return count;





    }

}
