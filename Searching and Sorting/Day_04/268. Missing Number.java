LeetCode - https://leetcode.com/problems/missing-number/description/


class Solution {
    public int missingNumber(int[] nums) {
        int i = 0;
        while(i < nums.length){
            int curr = nums[i];
            if(nums[i] < nums.length && nums[i] != nums[curr]){
                swap(nums, i, curr);
            }else{
                i++;
            }
        }
        for(int j = 0; j < nums.length; j++){
            if(nums[j] != j){
                return j;
            }
        }
        return nums.length;
    }
    void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}