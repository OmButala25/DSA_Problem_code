LeetCode - https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/



class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer>list=new ArrayList<>();
        int i=0;
        while(i<nums.length){
            int correct=nums[i]-1;
            if(nums[i]!=nums[correct]){
                int temp=nums[correct];
                nums[correct]=nums[i];
                nums[i]=temp;
            }
            else{
                i++;
            }
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j+1){
                list.add(j+1);
            }
         }
         return list;
    }
}


//using HashSet
// class Solution {
//     public List<Integer> findDisappearedNumbers(int[] a) {
//         Set<Integer> set = new HashSet<>();
//         ArrayList<Integer> result = new ArrayList<>();

//         for (int i : a) set.add(i); // removing duplicate elements

//        for(int i = 1; i <= a.length; i++){
//            if(!set.contains(i)) result.add(i);
//        }
//         return result;
//     }
// }