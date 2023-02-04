LeetCode - https://leetcode.com/problems/valid-palindrome/description/


class Solution {
    public boolean isPalindrome(String s) {
        String ans = s.toLowerCase();
        ans = ans.replaceAll("[^a-zA-Z0-9]", "");
        int a = 0;
        int z = ans.length()-1;
        while(a <= z) {
            if (ans.charAt(a) != ans.charAt(z)) {
                return false;
            }
            a++;
            z--;
        }
        return true;
    }
}

// public class Solution {
//     public boolean isPalindrome(String s) {
//         // convert Strign s to lowerCase with regex
//         String tempString = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
//         // Reverse the tempString 
//         String rev = new StringBuffer(tempString).reverse().toString();
//         // check tempString to rev String 
//         return tempString.equals(rev);
//     }
// }



// Recursion Method

// class Solution {
//     public boolean isPalindrome(String s) {
//        s = s.toLowerCase(); 
//     	s = s.replaceAll("[^a-zA-Z0-9]", "");// s = "amanaplanacanalpanama"
//     	return Recursive(s, 0, s.length()-1); // call method 
//     }
//     public boolean Recursive(String s, int start, int end) {  // method 
//     	if (start >= end)  // apply required condition 
//     		return true;
//     	if (s.charAt(start) != s.charAt(end)) // check first character first and last and continue process if first character and ednding character is not same then return false
//     		return false;
//     	return Recursive(s, start+1, end-1); // apply for every character 
//     }
// }