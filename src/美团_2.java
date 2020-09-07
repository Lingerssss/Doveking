import java.util.Scanner;

public class 美团_2 {

    public static void main(String[] args){
        Scanner str=new Scanner(System.in);
        String s=str.nextLine();
        char[] c=s.toCharArray();
        int count1=0;
        int count2=0;
        for(int i=0;i<c.length;i++){
            if(c[i]<='Z'&&c[i]>='A'){
                count1++;
            }
            if(c[i]<='z'&&c[i]>='a'){
                count2++;
            }
        }

        int res=Math.abs(count1-count2);
        System.out.println(res/2);
    }
}
