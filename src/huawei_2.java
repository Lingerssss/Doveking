import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class huawei_2 {
//    Scanner scanner = new Scanner(System.in);
//    String str1 = scanner.next();
//    String str1_content = scanner.next();


    public void show(String str1_content) {
        List<String> res = new ArrayList<>();
        String[] char_res = str1_content.split("/", str1_content.length());
        dfs(new StringBuilder(), char_res, 0, res);
        System.out.println(res);
    }

    void dfs(StringBuilder sb, String[] char_res, int index, List<String> res) {
        //
        if (index == char_res.length - 1) {
            return;
        }
        for (int i = 0; i < char_res.length; i++) {
            if (char_res[i].length() != 0) {
                sb.append("/");
                sb.append(char_res[i]);
                res.add(sb.toString());
            }
        }
    }



    public String rm(String str,String substr){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length();j++){
                if(str.substring(i,j+1).equals(substr)){
                    System.out.println("i: "+i);
                    System.out.println("j: "+j);
                    sb.append(str.substring(0,i+1));
                }
            }
        }
        System.out.println(sb);
        return sb.toString();
    }
    public String move(String src,String dst){
        if (src==null){
            return null;
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<src.length();i++){
            for(int j=i+1;j<dst.length();j++){
                if(src.substring(i,j+1).equals(dst)){
                    if(j!=src.length()){
                        return null;
                    }
                    System.out.println("i: "+i);
                    System.out.println("j: "+j);
                    sb.append(src.substring(0,i+1));
                    if(sb==null){
                        return null;
                    }
                }
            }
        }
        sb.append(src);
        sb.append(dst);
        System.out.println(sb);
        return sb.toString();
    }

}
