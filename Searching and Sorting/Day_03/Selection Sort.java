GFG - https://practice.geeksforgeeks.org/problems/selection-sort/1

class Solution{
	int select(int arr[], int i){
        // code here such that selectionSort() sorts arr[]
        int smallest = i;
        for(int j = i + 1; j < arr.length; j++){
            if(arr[j] <= arr[smallest]){
                smallest = j;
            }
        }
        return smallest;
    }
    void selectionSort(int arr[], int n){
        for(int i = 0; i < arr.length; i++){
            int actualSmallest = select(arr, i);
            int temp = arr[i];
            arr[i] = arr[actualSmallest];
            arr[actualSmallest] = temp;
        }
    }
}