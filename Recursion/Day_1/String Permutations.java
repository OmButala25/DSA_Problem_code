GFG - https://practice.geeksforgeeks.org/problems/permutations-of-a-given-string-1587115620/1?page=1&sortBy=submissions&searchQuery=permutation


class Solution
{
    public ArrayList<String> permutation(String S)
    {
        //Your code here
        ArrayList<String> list = new ArrayList<>();
        permute(S,"",list);
        Collections.sort(list);
        return list;
    }
    
    public void permute(String s,String ans,ArrayList<String> list){
        if(s.length() == 0){
            list.add(ans);
        }
        
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            
            String s1 = s.substring(0,i);
            String s2 = s.substring(i + 1);
            
            permute(s1 + s2, ans + ch, list);
        }
    }
	   
}