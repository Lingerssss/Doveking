import java.util.HashMap;
import java.util.Scanner;
/*问答题，第一个String是问题格式；第二个String是候选答案。
  符合条件返回1，否则返回0。如果答案输入不是英文或空格返回-1，输入异常返回-1*/

public class xiecheng {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //输入异常先返回-1
        if(sc.hasNextLine()==false){
            System.out.println(-1);
        }
        String q = sc.nextLine();
        if(sc.hasNextLine()==false){
            System.out.println(-1);
        }
        String a = sc.nextLine();
        System.out.println(judge(q,a));
    }
    public static int judge(String q, String a) {
        //用空格分隔字符串
        String[] res = a.split(" ");
        //遍历，不是英文字母返回-1
        for(String ss:res){
            for (int j = 0; j < ss.length(); j++) {
                char test = ss.charAt(j);
                if ((test <= 'z' && test >= 'a') || (test <= 'Z' && test >= 'A')) {
                } else {
                    return -1;
                }
            }
        }
        //命令和答案长度不同返回0
        if (q.length() != res.length) {
            return 0;
        }
        HashMap<Character, String> hm = new HashMap<>();
        for (int i = 0; i < q.length(); i++) {
            char c = q.charAt(i);
            String tmp = res[i];
            //命令相同答案不同返回令，否则继续
            if (hm.containsKey(c) == true) {
                if (tmp.equals(hm.get(c)) == false) {
                    return 0;
                }
            } else {
                //哈希表中已经包含了答案返回0，否则将新数据加到哈希表中
                if (hm.containsValue(tmp) == true) {
                    return 0;
                } else {
                    hm.put(c, tmp);
                }
            }
        }
        //遍历结束返回1
        return 1;
    }
}
