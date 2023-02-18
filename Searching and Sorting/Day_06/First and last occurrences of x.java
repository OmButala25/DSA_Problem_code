GFG - https://practice.geeksforgeeks.org/problems/first-and-last-occurrences-of-x3116/1


class GFG{
    ArrayList<Long> find(long arr[], int n, int x){
        // code here
        int f=-1,l=-1;
        for(int i=0; i<n; i++){
            if(arr[i]==x && f==-1){
                f=i;
            }
            if(arr[i]==x) l=i;
        }
        ArrayList<Long> res = new ArrayList<Long>();
        res.add((long)f);
        res.add((long)l);
        return res;
    }
}