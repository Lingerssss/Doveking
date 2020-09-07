import java.io.*;
import java.util.*;
public class 美团_1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int p=sc.nextInt();
        int q=sc.nextInt();
        if(n==0){
            System.out.println(0);
            System.out.println(0);
            System.out.println(0);

        }
        if(q==0){
            System.out.println(p);
            System.out.println(0);
            System.out.println(0);

        }
        if(p==0){
            System.out.println(0);
            System.out.println(q);
            System.out.println(0);

        }
        //System.out.println(n);
        //System.out.println(p);
        //System.out.println(q);
        int[] a=new int[p];
        for(int i=0;i<p;i++){
            a[i]=sc.nextInt();
            //System.out.println(a[i]);

        }
        int[] b=new int[q];
        for(int i=0;i<q;i++){
            b[i]=sc.nextInt();
            //System.out.println(b[i]);


        }
        int res3=count2(a,b);
        //System.out.println(res3);

        int res1=p-res3;
        int res2=q-res3;
        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);

    }
    static int count2(int[] a, int[] b){
        int res=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                if(a[i]==b[j]){
                    res++;
                    continue;
                }
            }

        }
        return res;
    }
}