import java.nio.charset.IllegalCharsetNameException;
import java.util.ArrayList;
import java.util.List;

public class Leetcode784_字母大小写全排列 {
    public List<String> letterCasePermutation(String S) {
        List<String> res = new ArrayList<>();

        dfs(S, 0, new StringBuilder(), res);
        return res;


    }

    void dfs(String str, int index, StringBuilder sb, List<String> res) {
        //System.out.println("index: "+index);
        if (index == str.length()) {
            res.add(new StringBuilder(sb).toString());
            System.out.println(res);
            return;
        }
        //

        char c = str.charAt(index);
        if (c >= 'a' && c <= 'z') {
            sb.append(c);
            dfs(str, index + 1, sb, res);
            sb.deleteCharAt(sb.length() - 1);

            c = reverse(c);

            sb.append(c);
            dfs(str, index + 1, sb, res);
            sb.deleteCharAt(sb.length() - 1);

            c = reverse(c);

        } else if (c >= 'A' && c <= 'Z') {
            sb.append(c);
            //System.out.println(sb);
            dfs(str, index + 1, sb, res);
            sb.deleteCharAt(sb.length() - 1);
            //System.out.println("sbbbbb: "+sb);

            c = reverse(c);
            sb.append(c);
            dfs(str, index + 1, sb, res);
            sb.deleteCharAt(sb.length() - 1);
            c = reverse(c);
        } else {
            sb.append(c);
            dfs(str, index+1, sb, res);
            sb.deleteCharAt(sb.length() - 1);
        }

    }


    char reverse(char c) {
        if (c >='a' && c <= 'z') {
            c -= 32;
            return c;
        }
        if (c >= 'A' && c <= 'Z') {
            c += 32;
            return c;
        } else return c;
    }


}
