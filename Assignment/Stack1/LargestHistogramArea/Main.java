package Assignment.Stack1.LargestHistogramArea;

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    
    
	public static void main (String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
        long n = Long.parseLong(br.readLine().trim());
        String inputLine[] = br.readLine().trim().split(" ");
        long[] arr = new long[(int)n];
        for(int i=0; i<n; i++)arr[i]=Long.parseLong(inputLine[i]);
        System.out.println(new Solution().maximumArea(arr, n));
	}
}

class Solution
{
	//this is first approach
	//nest smaller element to the left index
	// static int[] getNSELI(long[] arr, int n){
	// 	int[] nseli = new int[n];
	// 	Stack<Integer> st = new Stack<>();
	// 	for(int i=n-1; i>=0; i--){
	// 		long ele = arr[i];
	// 		while(st.size() > 0 && arr[st.peek()] > ele){
	// 			nseli[st.peek()] = i;
	// 			st.pop();
	// 		}
	// 		st.push(i);
	// 	}
	// 	while(st.size() > 0){
	// 		nseli[st.peek()] = -1;
	// 		st.pop();
	// 	}
	// 	return nseli;
	// }

	// //next smaller element to the right index

	// static int[] getNSERI(long[] arr, int n){
	// 	int[] nseri = new int[n];
	// 	Stack<Integer> st = new Stack<>();
	// 	for(int i=0; i<n; i++){
	// 		long ele = arr[i];
	// 		while(st.size() > 0 && arr[st.peek()] > ele){
	// 			nseri[st.peek()] = i;
	// 			st.pop();
	// 		}
	// 		st.push(i);
	// 	}
	// 	while(st.size() > 0){
	// 		nseri[st.peek()] = n;
	// 		st.pop();
	// 	}
	// 	return nseri;
	// }
    //   public static long maximumArea(long hist[], long n){
	// //Your code here 
	// 	  int[] nseli = getNSELI(hist, (int)n);
	// 	  int[] nseri = getNSERI(hist, (int)n);
	// 	  long maxArea = 0;
	// 	  //finding area
	// 	  for(int i=0; i<(int)n; i++){
	// 		  long height = hist[i];
	// 		  int width = nseri[i] - nseli[i] - 1;
	// 		  long area = width * height;
	// 		  maxArea = Math.max(area, maxArea);
	// 	  }
	// 	  return maxArea;
		  
	//2nd approach

	public static long maximumArea(long hist[], long n){
		Stack<Integer> st = new Stack<>();
		st.push(-1);
		long maxArea = 0;

		for(int i=0; i<(int)n; i++){
			long val = i == hist.length ? 0 : hist[i];
			while(st.peek() != -1 && hist[st.peek()] > val){
				int rm = i; // right minimum
				long h = hist[st.pop()]; // height
				int lm = st.peek(); // left minimum
				maxArea = Math.max(maxArea, h*(rm-lm-1));

			}
			st.push(i);
		}
		return maxArea;
	}

}




