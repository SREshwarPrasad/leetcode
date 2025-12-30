/*209. Minimum Size Subarray Sum

Given an array of positive integers nums and a positive integer target, return the minimal length of a subarray whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.

 

Example 1:

Input: target = 7, nums = [2,3,1,2,4,3]
Output: 2
Explanation: The subarray [4,3] has the minimal length under the problem constraint.
Example 2:

Input: target = 4, nums = [1,4,4]
Output: 1
Example 3:

Input: target = 11, nums = [1,1,1,1,1,1,1,1]
Output: 0*/


class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
        int len = Integer.MAX_VALUE;
        int sum = 0;
        for(int start=0, end=0; end<nums.length; end++){
            sum+=nums[end];
            while(sum>=target){
                len = Math.min(len, end-start+1);
                sum-=nums[start];
                start++;
            }
        }
        return len!=Integer.MAX_VALUE?len:0;
    }
}
