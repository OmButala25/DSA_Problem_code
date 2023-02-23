GFG - https://practice.geeksforgeeks.org/problems/majority-element-1587115620/1


class Solution{
    static int majorityElement(int a[], int size){
        // your code here
        int[] ans = new int[10000000];
        for(int i = 0; i < a.length; i++){
            ans[a[i]]++;
        }
        for(int i = 0; i < a.length; i++){
            if(ans[a[i]] > size/2){
            return a[i];
            }    
        }
        return -1;
    }
}