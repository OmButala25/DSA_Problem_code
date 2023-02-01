GFG -https://practice.geeksforgeeks.org/problems/max-min/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article

class Solution
{ 
    public static int findSum(int A[],int N) 
    {
        //code here
        Arrays.sort(A);
        int ans = A[0]+A[N-1];
        return ans;
    }
}