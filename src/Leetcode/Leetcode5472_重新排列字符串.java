import java.util.HashMap;
import java.util.Map;

public class Leetcode5472_重新排列字符串 {
    public String restoreString(String s, int[] nums) {
        StringBuilder res = new StringBuilder();
        Map<Integer, String> m = new HashMap();

        for (int i = 0; i < nums.length; i++) {
            m.put(nums[i], s.substring(i, i));
            System.out.println();
        }
//        m.forEach((k, v) -> {
//            k = indices[count[0]];
//            v = s.charAt(count[0]);
//            count[0]++;
//            System.out.println(k);
//            System.out.println(v);
//
//        });
        for (int i = 0; i < m.size(); i++) {
            res.append(m.get(i));
            System.out.println(res);

        }
        return res.toString();

    }
}

