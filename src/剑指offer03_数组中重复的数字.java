import java.util.Arrays;
import java.util.HashSet;

public class 剑指offer03_数组中重复的数字 {
    //1.使用集合
    public int findRepeatNumber(int[] nums) {
        HashSet hs=new HashSet();
        for(int i:nums){

            if(hs.add(i)==false){
                return i;
            }
            hs.add(i);

        }
        return -1;
    }
    //2.先排序再查找
    public int findRepeatNumber1(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]){
                return nums[i];
            }

        }
        return -1;
    }

    //3.临时数组建立映射
    public int findRepeatNumber2(int[] nums) {
        int length = nums.length;
        int[] temp = new int[length];
        for (int i = 0; i < length; i++) {
            temp[nums[i]]++;
            if (temp[nums[i]] > 1){
                return nums[i];
            }

        }
        return -1;
    }
    //4.放到指定的位置
    public int findRepeatNumber3(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            //位置正确，先不用管
            if (i == nums[i]){
                continue;
            }

            //出现了重复，直接返回
            if (nums[i] == nums[nums[i]]) {
                return nums[i];
            }
            //交换
            int temp = nums[nums[i]];
            nums[nums[i]] = nums[i];
            nums[i] = temp;
            //这里的i--是为了抵消掉上面的i++，
            //交换之后需要原地再比较
            i--;
        }
        return -1;
    }





}
