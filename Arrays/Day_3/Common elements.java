GFG - https://practice.geeksforgeeks.org/problems/common-elements1132/1

class Solution
{
    ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) 
    {
        // code here 
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        HashSet<Integer> set3 = new HashSet<>();
        for (int i=0;i<n1;i++)
            set1.add(A[i]);
        for (int i=0;i<n2;i++)
            set2.add(B[i]);
        for (int i=0;i<n3;i++) {
            if (set1.contains(C[i]) && set2.contains(C[i])) {
                if (!set3.contains(C[i]))
                        list.add(C[i]);
                set3.add(C[i]);
            }
        }
        return list;
    }
}