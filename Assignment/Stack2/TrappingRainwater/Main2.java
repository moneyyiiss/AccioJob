package Assignment.Stack2.TrappingRainwater;

import java.io.*;
import java.util.*;
//using stack
//time complacity is o(n);
// and space complexicity is o(n);
class Solution {
    
    public void TappingWater(int[] arr, int n) {
        //Write code here and print output
        Stack<Integer> st = new Stack<>();
        int ans = 0;
        for(int i=0; i<arr.length; i++){
            while(st.size() > 0 && arr[st.peek()] <= arr[i]){
                int rm = i;
                int curr = arr[st.pop()];
                int lm = st.peek();
                int width = rm - lm - 1;
                ans+= (Math.max(arr[rm], arr[lm]) - curr)*width; 
            }
            st.push(i);
        }
        System.out.println(ans);
    }
}


public class Main2 {
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

