public class Leetcode1004_最大连续1的个数3_bili94_1 {
    // 滑动窗口
    /*右指针一直向右，当k=0时，如果左指针下一位为1可以将左指针右移，
    一直移动到右边第一个0的地方。这样可以保证腾出一个0的空间。*/
    public int longestOnes(int[] A, int K) {
        int res=0, left=0,right=0;
        for(;right<A.length;right++){
            if(A[right]==0){

                if(K>0){
                    K--;
                }
                else{
                    System.out.println("right: "+right);
                    //因为right已经移动到了第k+1个0，所以宽度应该是(right-1)-left+1即right-left
                    res=Math.max(res,right-left);
                    //左指针右移
                    while(A[left++]==1)
                    {
                        System.out.println("A: "+A[left]);

                        System.out.println(left);
                    };
                }
            }
        }
        return Math.max(res,right-left);
    }
}
