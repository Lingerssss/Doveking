import java.util.Scanner;

public class baidu_3 {
    void s1(){
        Scanner scanner = new Scanner(System.in);
        //n学生人数
        int n=scanner.nextInt();
        //m食堂个数
        int m=scanner.nextInt();
        //食堂数组
        int[] p=new int[m];
        for(int i=0;i<m;i++){
            p[i]=scanner.nextInt();

        }
    }

    void s2(int n,int m,int[] p){
        double exp=n/m;
        double count=0.0;
        for(int i=0;i<m;i++){
            count=Math.pow(exp,i);
            //判断剩余的n是否还大于

        }
        double res=exp*n/m;
        System.out.println(res);
    }

}
