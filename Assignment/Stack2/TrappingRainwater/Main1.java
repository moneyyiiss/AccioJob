package Assignment.Stack2.TrappingRainwater;

import java.io.*;
import java.util.*;
// Using array
//this is two pointer approach
//time complacity is o(n);
// and space complexicity is o(1);
class Solution {
    public void TappingWater(int[] arr, int n) {
        //Write code here and print output
        int left = 0;
		int right = arr.length-1;
		int leftMax = 0;
		int rightMax = 0;
		int res = 0;
		while(left <= right){
			if(arr[left] <= arr[right]){
				if(arr[left] >= leftMax){
					leftMax = arr[left];
				}else{
					res+=leftMax - arr[left];
				}
				left++;
			}else{
				if(arr[right] >= rightMax){
					rightMax = arr[right];
				}else{
					res+= rightMax - arr[right];
				}
				right--;
			}
		}
		System.out.println(res);
       
    }
}

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
            int n= sc.nextInt();
      	    int[] arr= new int[n];

      	    for(int i=0;i<n;i++)
                arr[i]=sc.nextInt();
            
        
            Solution Obj = new Solution();
            Obj.TappingWater(arr, n);
            
        
        sc.close();
        
    }
}
