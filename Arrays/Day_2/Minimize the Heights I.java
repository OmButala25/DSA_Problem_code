GFG - https://practice.geeksforgeeks.org/problems/minimize-the-heights3351/1

class Solution {
    int getMinDiff(int[] arr, int n, int k) {
        // code here
        Arrays.sort(arr);
        int ans = arr[n-1] - arr[0];
        int min = arr[0];
        int max = arr[n-1];
        
        for(int i = 1; i < n; i++){
            if(arr[i] - k < 0) continue;
            min = Math.min(arr[0] + k, arr[i] - k);
            max = Math.max(arr[i-1] + k, arr[n-1] - k);
            ans = Math.min(ans, max - min);
        }
        return ans;
    }
}