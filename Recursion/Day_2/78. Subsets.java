LeetCode - https://leetcode.com/problems/subsets/description/ 


class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> outer=new ArrayList<>();
        outer.add(new ArrayList<>());   //empty set[]
        for(int num:nums){  //1 2 3
            int size=outer.size();  //to fix the size one by one iterator
            for(int i=0;i<size;i++){
                List<Integer> internal=new ArrayList<>(outer.get(i));   //to get list one by one firstly it will give[] (copy list)
                internal.add(num);  //take next [1]
                outer.add(internal);   //then add for each 
            }
        }
        return outer;   //return list
    }
}