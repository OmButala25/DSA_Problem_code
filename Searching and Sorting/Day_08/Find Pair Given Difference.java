GFG - https://practice.geeksforgeeks.org/problems/find-pair-given-difference1559/1


class Solution
{
    boolean BinarySearch(int[] arr, int key, int low, int high)
    {
        while(low<=high)
        {
            int mid = low+(high-low)/2;
            if(arr[mid]==key)
            {
                return true;
            }
            else if(arr[mid]>key)
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return false;
    }
    public boolean findPair(int arr[], int size, int n)
    {
        //code here.
        Arrays.sort(arr);
        boolean ans = false;
        for(int i=0;i<size;i++)
        {
            int key = n+arr[i];
            ans = BinarySearch(arr, key, i+1, size-1);
            if(ans)
                return true;
        }
        return ans;
    }
}