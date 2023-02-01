GFG-https://practice.geeksforgeeks.org/problems/union-of-two-arrays3538/1

class Solution{
    public static int doUnion(int a[], int n, int b[], int m) 
    {
        //Your code here
        HashSet<Integer> h= new HashSet<>();
        for(int i=0;i<n;i++){
            h.add(a[i]);
        }
        for(int i=0;i<m;i++){
            h.add(b[i]);
        }
        return h.size();//Your code here
    }
}