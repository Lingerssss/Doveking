package Leetcode;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Leetcode215_数组中的第K个最大元素 {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
    public int find2(int[] nums,int k){
        PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
        for(int i:nums){
            pq.add(i);
            if(pq.size()>k){
                pq.poll();
            }
        }
        return pq.peek();
    }

}
