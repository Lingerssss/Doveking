package Leetcode;

public class Leetcode657_机器人能否返回原点 {
    public boolean judgeCircle(String moves) {
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < moves.length(); i++) {
            if (moves.charAt(i) == 'U') {
                count1 += 1;
            }
            if (moves.charAt(i) == 'D') {
                count1 -= 1;
            }
            if (moves.charAt(i) == 'L') {
                count2 -= 1;
            }
            if (moves.charAt(i) == 'R') {
                count2 += 1;
            }
        }
        if (count1 == 0 && count2 == 0) {
            return true;
        }
        return false;

    }
}
