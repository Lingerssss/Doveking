import java.util.List;

public class Leetcode1239_串联字符串的最大长度 {

    public int maxLength(List<String> arr) {
        int[] maxlen=new int[1];
        dfs(arr, 0, 0, 0,maxlen);
        return maxlen[0];
    }
    private void dfs(List<String> arr, int index, int ck, int tempMax,int[] maxlen) {
        if (index == arr.size()) {
            maxlen[0] = Math.max(maxlen[0], tempMax);
            return;
        }
        String str = arr.get(index);
        int temp_str = is_str_same(ck, str);
        if (temp_str != -1) {
            dfs(arr, index + 1, temp_str, tempMax + str.length(),maxlen);
        }
        dfs(arr, index + 1, ck, tempMax,maxlen);
    }
    // 比较str和之前ck代表的字符串是否有相同字符，如果没有，则把str代表的ck加去，如果有，则返回-1
    private int is_str_same(int ck, String str) {
        char[] chars = str.toCharArray();
        for(char c: chars) {
            int tempInt = c - 'a';
            if ((ck & (1 << tempInt)) != 0) {
                return -1;
            }
            ck = ck | (1 << tempInt);
        }
        return ck;
    }
    /*private boolean notEqual(String a, String b) {
        int[] charArray = new int[30];
        for (int i = 0; i < a.length(); i ++) {
            charArray[a.charAt(i) - 'a'] = 1;
        }
        for (int i = 0; i < b.length(); i ++) {
            if (charArray[b.charAt(i) - 'a'] == 1) {
                return false;
            }
        }
        return true;
    }*/

    //



}
