package com.thread.programs;
/*
Enter a String : Visshall

The character V has occurred for 1 times
The character a has occurred for 1 times
The character h has occurred for 1 times
The character i has occurred for 1 times
The character l has occurred for 2 times
The character s has occurred for 2 times
*/
import java.util.Scanner;

public class CharacterFrequency {

	   public static void main(String args[])
	   {
	        int ci, i, j, k, l=0;
	        String str, str1;
	        char c, ch;
	        Scanner scan = new Scanner(System.in);
	        
	        System.out.print("Enter a String : ");
	        str=scan.nextLine();
	        
	        i=str.length();
	        for(c='A'; c<='z'; c++)
	        {
	            k=0;
	            for(j=0; j<i; j++)
	            {
	                ch = str.charAt(j);
	                if(ch == c)
	                {
	                    k++;
	                }
	            }
	            if(k>0)
	            {
	                System.out.println("The character " + c + " has occurred for " + k + " times");
	            }
	        }
	   }
	}
