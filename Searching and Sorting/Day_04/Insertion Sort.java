GFG - https://practice.geeksforgeeks.org/problems/insertion-sort/1


class Solution{
  static void insert(int arr[],int i){
       // Your code here
  }
  //Function to sort the array using insertion sort algorithm.
  public void insertionSort(int arr[], int n){
    //code here
    for(int i = 0; i < n-1; i++){
        for(int j = i+1; j > 0; j--){
            if(arr[j] < arr[j-1]){
                swap(arr, j, j-1);
            }else{
                break;
            }
        }
    }
  }
  static void swap(int arr[], int a, int b){
      int temp = arr[a];
      arr[a] = arr[b];
      arr[b] = temp;
  }
}