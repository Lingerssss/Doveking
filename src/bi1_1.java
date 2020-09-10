/*
public class bi1_1 {
    class Solution {
        public:
        int longestOnes(vector<int>& A, int K) {
            //count用来统计窗口中0的个数
            int left=0,right=0,count=0,result=0,size=A.size();

            while(right<size)
            {
                count+=A[right]==0;
                while(count>K)//当窗口内0的个数大于K时，需要缩小窗口
                {
                    count-=A[left]==0;
                    left++;
                }
                //窗口内0的个数小于等于k时，也就是可以该窗口内的0都可以替换，根据该窗口长度来确定是否更新result
                result=max(result,right-left+1);
                right++;
            }
            return result;
        }
    };

}
*/
