GFG - https://practice.geeksforgeeks.org/problems/minimum-number-of-jumps-1587115620/1

class Solution{
    static int minJumps(int[] arr){
        // your code here
        int jump = 0;
        int des = 0; //destination
        int pos = 0; //position
        
        for(int i = 0; i < arr.length-1; i++){  //-1 not to take jump of last one
            des = Math.max(des, arr[i]+i); //take des from first about 0 and arr[i] means 1 + 0 from that take max
            if(pos >=arr.length-1) 
            break;
            else if(des<=i)
            return -1;
            else if(pos == i){ //
                pos = des;
                jump++;
            }
        }
        return jump;
    }
}