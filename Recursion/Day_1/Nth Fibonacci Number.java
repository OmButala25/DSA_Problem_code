GFG - https://practice.geeksforgeeks.org/problems/nth-fibonacci-number1335/1?page=1&sortBy=submissions&searchQuery=fibonacci


//User function Template for Java
class Solution {
    static long nthFibonacci(long n){
        // code here
        
        // if(n<2){
        //     return n;
        // }
        // return nthFibonacci(n-1) + nthFibonacci(n-2);
        
        
        long a =0;
        long b =1;
        if(n==a || n==b) return n;
        long c=0;
        for(int i =2;i<=n;i++){
            c= (a+b)%1000000007;  //answer can be very large so we divided by 10^7
            a=b;
            b=c;
        }
        return c;
    }
}