import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class 度小满_1 {
    public static void main(String[] args){
        //输入
        Scanner scanner = new Scanner(System.in);
        String s1=scanner.nextLine();
        String s2=scanner.nextLine();
        char[] c1=new char[s1.length()];
        char[] c2=new char[s2.length()];
        for(int i=0;i<c1.length;i++){
            c1[i]=s1.charAt(i);
        }
        for(int i=0;i<c2.length;i++){
            c2[i]=s2.charAt(i);
        }
        int[] index=new int[1];
        int res=0;
        Map<Character, Integer> m=new HashMap<>();



        //算法
        for(char i:c2){
            m.put(i,m.containsKey(i)?m.get(i)+1:1);
        }
        //遍历c1，如果有重复的哈希表对应值-1
        for(char s:c1){
            if(m.containsKey(s)&&m.get(s)>0){
                int tmp=m.get(s);
                m.put(s,tmp-1);
                res++;
            }
        }
        System.out.println(res);
    }
}
