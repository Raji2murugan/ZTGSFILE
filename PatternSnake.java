package ztgs;

import java.util.Arrays;

public class PatternSnake {
	
	
	   public static void main(String[] args) {
	        int n =5;
	        int[][] arr = new int[n][n];
	        
	        int count=1;
	        int i, row, col, temp;
	        for(i = 1; i <= 2*n -1; i++){
	            temp = Math.min(i, 2*n - i);
	            if(i%2 ==0){
	                if(i<=n){
	                    row = i-1;
	                    col = n-1;
	                } else {
	                    row = n-1;
	                    col = n - 1 - (i - n);
	                }
	                for(int j=temp; j>0; j--){
	                    arr[row][col]= count++;
	                    row--;
	                    col--;
	                }
	            } else{
	                if(i <= n){
	                    row = 0;
	                    col = n-i;
	                } else {
	                    row = i - n;
	                    col = 0;
	                }
	                for(int j=temp; j>0; j--){
	                    arr[row][col]= count++;
	                    row++;
	                    col++;
	                }
	            }
	        }
	        
	        System.out.println("Raji"=="Raji");
	   System.out.println(Arrays.deepToString(arr));
	  
	    }

	}
