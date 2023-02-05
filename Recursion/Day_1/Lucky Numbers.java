GFG - https://practice.geeksforgeeks.org/problems/lucky-numbers2911/1?page=1&category[]=Recursion&sortBy=submissions


class Solution{
    // Complete the function
    // n: Input n
    // Return True if the given number is a lucky number else return False
    public static boolean isLucky(int n){
        // Your code here
        //  for(int i=2;i<=n;i++){
        //   if(n%i==0)return false;
        //   n = n - n/i; 
        // }
        // return true;
        
        
        return help(n,2);
    }
    public static boolean help(int n,int count){
        if(count >n) return true;   
        if(n%count==0)return false;
        n= n-(n/count);
        return help(n,count+1); 
    }
}