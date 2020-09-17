import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class 巨人_中位数 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        double[] p=new double[n];
        for(int i=0;i<n;i++){
            p[i]=scanner.nextDouble();
            System.out.println(p[i]);
            Arrays.sort(p);
            mid(p,i+1);
        }
    }



    static void mid(double[] p,int len){


        //System.out.println("len: "+len);

        if(len%2==1){
            int index=(len+1)/2-1;
            double res=p[(len+1)/2-1];
            for(double i:p){
                System.out.println("zhi: "+i);
            }
            System.out.println(res);
        }
        else{
            double res=p[len/2];

            System.out.println(res);
        }


    }
}
