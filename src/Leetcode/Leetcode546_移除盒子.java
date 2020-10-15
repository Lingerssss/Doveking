import java.util.Arrays;

public class Leetcode546_移除盒子 {
    int res = 0;
    public int removeBoxes(int[] boxes) {
        int bound = 0;
        for (int i = 0; i < boxes.length; i++) {
            if (i > 0 && boxes[i] != boxes[i - 1]) {
                int[] box1 = Arrays.copyOfRange(boxes, 0, bound);
                int[] box2 = Arrays.copyOfRange(boxes, i, boxes.length);
                int[] both = contact(box1, box2);
                System.out.println(i + "\t" + bound + "\t" + Arrays.toString(box1) + "\t"+Arrays.toString(both) + "\t"  + res);
                int curRes = (i - bound) * (i - bound) + removeBoxes(both);
                res = Math.max(curRes, res);
//                System.out.println(i + " " + bound + " " + res);
//                if (res == 15) {
//                    int val = 1;
//                }
                bound = i;
            }
        }
        if (bound == 0) {
            return boxes.length * boxes.length;
        }
        System.out.println(res);
        return res;
    }
    private int[] contact(int[] box1, int[] box2) {
        int length1 = box1.length;
        int length2 = box2.length;
        int[] both = new int[length1 + length2];
        for (int i = 0; i < length1; i++) {
            both[i] = box1[i];
        }
        for (int i = 0; i < length2; i++) {
            both[length1 + i] = box2[i];
        }
        return both;
    }
}
