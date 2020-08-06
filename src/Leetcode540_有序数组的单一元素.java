import java.util.HashMap;
import java.util.Map;

public class Leetcode540_有序数组的单一元素 {
    public int singleNonDuplicate(int[] nums) {
        Map<Integer, Integer> m = new HashMap<>();
        for (int i : nums) {
            m.put(i, m.containsKey(i) ? m.get(i) + 1 : 1);
        }
        for (int i = 0; i < m.size(); i++) {
            if (m.get(i) == 1) {
                return i;
            }
        }
        return 0;
    }
}
