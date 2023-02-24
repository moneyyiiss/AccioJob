package Assignment.Stack2.TrappingRainwater;

import java.util.Scanner;
import java.util.Stack;

class Solution {
    
    public void TappingWater(int[] arr, int n) {
        //Write code here and print output
        int l = 0;
        int r = arr.length - 1;
        int lmax = 0, rmax = 0;
        int ans = 0;
        while(l<r){
            lmax = Math.max(lmax, arr[l]);
            rmax = Math.max(rmax, arr[r]);
            if(lmax < rmax){
                ans+=lmax-arr[l];
                l++;
            }else{
                ans+=rmax - arr[r];
                r--;
            }
        }
        System.out.println(ans);
    }
}
public class Main3 {
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
