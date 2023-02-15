GFG - https://practice.geeksforgeeks.org/problems/bubble-sort/1


class Solution
{
    //Function to sort the array using bubble sort algorithm.
	public static void bubbleSort(int arr[], int n)
    {
        //code here
        int temp = 0;
        for(int i = 0; i < n; i++){
            for(int j = 1; j < n-i; j++){
                if(arr[j] < arr[j-1]){
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
}