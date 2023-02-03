GFG - https://practice.geeksforgeeks.org/problems/count-pairs-with-given-sum5022/1

class Solution {
    int getPairsCount(int[] arr, int n, int k) {
        // code here
        
        Map<Integer,Integer> map = new HashMap<>();
        int count = 0;
        
        for(int i=0;i<n;i++) {
            
            if(map.containsKey(k-arr[i])){
                count+=map.get(k-arr[i]);
            }
            int occurance = map.getOrDefault(arr[i],0);
            map.put(arr[i], occurance+1);
        }
        return count;
    }
}