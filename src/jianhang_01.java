import java.util.Scanner;

public class jianhang_01 {
    public static void main(String[] args) {
        int[] p=new int[100];
        Scanner sc = new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=str1.substring(1,str1.length()-1);


        String[] res=str2.split(",");
        int[] ss=new int[res.length];
        for(int i=0;i<ss.length;i++){
            ss[i]=Integer.parseInt(res[i]);
        }
        if(isCount(ss)==true){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }



    }
    static boolean isCount(int[] p){
        int[] count=new int[3];
        for(int i=0;i<p.length;i++){
            if(p[i]==5){
                count[0]++;
            }
            if(p[i]==10){
                if(count[0]<=0){
                    return false;
                }
                else {
                    count[0]--;
                    count[1]++;
                }
            }
            if(p[i]==20){
                if(count[1]<=0){
                    if(count[0]<3){
                        return false;
                    }
                    else {
                        count[0]-=3;
                    }
                }
                else{
                    count[1]--;
                    if(count[0]<=0){
                        return false;
                    }
                    else {
                        count[0]--;
                    }
                }
            }
        }
        return true;
    }
}
