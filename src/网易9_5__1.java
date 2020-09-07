import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 网易9_5__1 {
    int[] sort(int[] p){
        int index=0;
        int count1=0;
        int count2=0;
        Arrays.sort(p);

        for(int i=0;i<p.length;i++){
            if(p[i]>0){
                index=i;
                break;

            }
            count1++;
        }
        reverse(p,index,p.length-1);
        //p=maopao(p,count1,index);
        return p;

    }
    void reverse(int[] num,int index1,int index2){
        for(int i=index1;i<index2/2;i++){
            int temp=num[i];
            num[i]=num[index2-i-1];
            num[index2-1-i]=temp;
        }

    }
    int[] maopao(int[] num,int count1,int index){
        if(count1==0){
            return num;
        }
        int[] num2=new int[num.length];

        int j1=num.length-1;
        int j2=num.length-1;
                for(int i=num.length-1;i>0;i--){
                    if(i%2==0){
                        num2[i]=num[j1];
                        j1--;
                    }
                    if(i%2!=0){
                        if(index+j2>=num.length){
                            break;
                        }
                        num2[i]=num[index+j2];
                        j2++;
                    }
                }
                return num2;

    }


}
