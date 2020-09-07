/*public class Leetcode5_最长回文串 {
    public String longestPalindrome(String s) {
        char[] c=s.toCharArray();
        if(s==null){
            return null;
        }
        StringBuilder sum = new StringBuilder();
        StringBuilder res=new StringBuilder();
        sum.append(c[0]);
        for(int i=1;i<s.length();i++){
            if(huiwenchuan(sum.toString())==true){
                sum.append(i);
            }
            else {
                sum.delete(0,i);
                sum.append(i);
            }
            if(res.length()>sum.length()){

            }
            else res=sum;
        }
        return res.toString()



    }

    public int maxSubArray(int[] nums) {
        int ans = nums[0];
        int sum = 0;
        for (int num : nums) {
            if (sum > 0) {
                sum += num;
            } else {
                sum = num;
            }
            ans = Math.max(ans, sum);
        }
        return ans;
    }
    boolean huiwenchuan(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }
        return true;

    }


}*/
