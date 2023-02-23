GFG - https://practice.geeksforgeeks.org/problems/find-missing-and-repeating2512/1


class Solve {
    int[] findTwoElement(int arr[], int n) {
        // code here
        int repNo = 0,misNo=0;
        int find[] = new int[n+1];
        for(int i=0;i<n;i++){
            find[arr[i]]++;
        }
        for(int i=1;i<find.length;i++){
            if(find[i]==2){
                repNo = i;
            }
            if(find[i]==0){
                misNo = i;
            }
        }
        return new int[]{repNo,misNo};
    }
}