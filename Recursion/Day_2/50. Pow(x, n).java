LeetCode - https://leetcode.com/problems/powx-n/description/


class Solution {
    public double myPow(double x, int n) {
        if (n == 0) return 1.0;
        else if (n % 2 == 1) return x * myPow(x, n - 1);
        else if (n % 2 == 0) return myPow(x * x, n / 2);
        else return 1 / myPow(x, -n);
    }
}

class Solution 
{
    public double myPow(double x, int n) 
    {
        double ans = 1.0;
        long num = n;
        
        if(num < 0)
        {
            num = -1 * num;
        }

        while(num > 0)
        {
            if(num % 2 == 1)
            {
                ans = ans * x;
                num = num - 1;
            }
            else
            {
                x = x * x;
                num = num / 2;
            }
        }
        if(n < 0)
        {
            ans = (double)(1.0) / (double)(ans);
        }
        return ans;

    }
}