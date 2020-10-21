/*
import java.util.Scanner;
import java.util.

public class didi {
    public Interval solve(int a,int b,String str1,String str2){
        Interval res=new Interval();
        int c=a-b;
        int least=0;
        int most=0;
        int same=0;
        if(str1.equals(str2)){
            */
/*a.start=b;
            a.end=b;*//*

            least=b;
            most=b;
            System.out.println(least);
            System.out.println(most);
            return res;

        }
        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i)==str2.charAt(i)){
                same++;
            }
        }
        int unsame=a-same;
        */
/*a.start=b-unsame>0?b-unsame:0;

        a.end=same-b>0?same:b;*//*

        System.out.println(same);
        int m1=same>b?b:same;
        int m2=unsame<c?unsame:unsame-c;
        least=b>unsame?b-unsame:0;
        most=m1+m2;
        return res;





    }

}
*/
