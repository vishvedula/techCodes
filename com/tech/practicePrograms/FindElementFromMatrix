
/**
 * Java code to find an element for a Given MATRIX
 */
package com.thread.programs;

public class FindElementFromMatrix {
	@SuppressWarnings("unused")
	public static void main(String args[]){
		
		int mat[][] ={ {10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 37, 48},
                {32, 33, 39, 50},
              };
		int search = search(mat, 4, 29);
	}

	static int search(int mat[][], int n, int x)
	{
	   int i = 0, j = n-1;  //set indexes for top right element
	   while ( i < n && j >= 0 )
	   {
	      if ( mat[i][j] == x )
	      {
	        System.out.println(i);
	        System.out.println(j);
	         return 1;
	      }
	      if ( mat[i][j] > x )
	        j--;
	      else //  if mat[i][j] < x
	        i++;
	   }
	 
	   System.out.println("\n Element not found");
	   return 0;  // if ( i==n || j== -1 )
	}

}
