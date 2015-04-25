package com.tech.practicePrograms;
import java.util.Scanner;


public class WeirdNumberSeq {

	/**
	 * @param args
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {
//		int number = new Scanner(System.in).nextInt();
//		System.out.println(fetchSequence(number));
//	}
//	private static int fetchSequence(int number) {
//		String str1 = "", str2 = "";
//		for(int i=1; i<number; i++){
//			str1 += i;
//			str2 = i+str2;
//		}
//		System.out.println(""+str1+number+str2);
//		return number;
//	}
			int number;

	  		Scanner sc=new Scanner(System.in);
	     		System.out.println("Enter the number:");
	                number=sc.nextInt();
	               System.out.println("Sequence is:");
	                String str1 = "", str2 = "";
			for(int i=1; i<number; i++){
				str1 += i;
				str2 = i+str2;
			}
			//number = Integer.parseInt(str1)+number+Integer.parseInt(str2);
	System.out.println((str1)+number+Integer.parseInt(str2));
	               
			}
	
}