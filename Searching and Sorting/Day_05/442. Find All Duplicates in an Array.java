LeetCode - https://leetcode.com/problems/find-all-duplicates-in-an-array/description/


class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list=new ArrayList<>();
        int i=0;
        while(i<nums.length){
            int correct=nums[i]-1;
            if(nums[i] != nums[correct]){
                int temp=nums[i];
                nums[i]=nums[correct];
                nums[correct]=temp;
            }
            else{
                i++;
            }
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j+1){
                list.add(nums[j]);
            }
         }
         return list;
    }
}


// class Solution {
//     public List<Integer> findDuplicates(int[] nums) {
//         HashSet<Integer> set = new HashSet<>();
//         List<Integer> list = new ArrayList<>();
//         for(int i : nums){
//             if(set.contains(i)){        //to check whether it already contains or not and add
//                 list.add(i);
//             }else{
//                 set.add(i);
//             }
//         }
//         return list;
//     }
// }