GFG - https://practice.geeksforgeeks.org/problems/kadanes-algorithm-1587115620/1

class Solution{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n){
        
        // Your code here
        int currentsum = 0;
        long maxsum = Integer.MIN_VALUE;
        
        for(int i = 0; i< n; i++){
            
            currentsum = currentsum + arr[i];
            
            if(currentsum > maxsum){
                maxsum = currentsum;
            }
            
            if(currentsum < 0){
                currentsum = 0;
            }
        }
        return maxsum;
    }
    
}