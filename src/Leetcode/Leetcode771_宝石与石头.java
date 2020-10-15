public class Leetcode771_宝石与石头 {
    public int numJewelsInStones(String J, String S) {
        int count=0;
        char[] J_array=J.toCharArray();
        char[] S_array=S.toCharArray();
        for(char c1:J_array){
            for(char c2:S_array){
                if(c1==c2){
                    count++;
                }
            }
        }
        return count;

    }

}
