GFG - https://practice.geeksforgeeks.org/problems/stickler-theif-1587115621/1



class Solution
{
    //Function to find the maximum money the thief can get.
    public int FindMaxSum(int arr[], int n)
    {
        // Space optimization
        if(n == 0) return 0;
        if(n == 1) return arr[0];
        
        int first = arr[0];
        int second = Math.max(first,arr[1]);
        
        for(int i=2;i<n;i++){
            int temp = second;
            second = Math.max(second,first+ arr[i]);
            first = temp;
        }
        return second;
    }
}