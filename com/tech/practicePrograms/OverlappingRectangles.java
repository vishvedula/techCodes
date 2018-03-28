/**
Given two rectangles, find if the given two rectangles overlap or not. 
A rectangle is denoted by providing the x and y co-ordinates of two points: the left top corner and the right bottom corner of the rectangle.

Note that two rectangles sharing a side are considered overlapping.

rectanglesOverlap

Input:

The first integer T denotes the number of test cases. For every test case, there are 2 lines of input. 
The first line consists of 4 integers: denoting the co-ordinates of the 2 points of the first rectangle.
The first integer denotes the x co-ordinate and the second integer denotes the y co-ordinate of the left topmost corner of the first rectangle.
The next two integers are the x and y co-ordinates of right bottom corner. Similarly, the second line denotes the cordinates of the two points of the second rectangle.

**/

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class Point{
    int x;
    int y;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
}

class OverlappingRectangles {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int notc = sc.nextInt();
		while(notc-- > 0){
		    Point l1 = new Point(sc.nextInt(), sc.nextInt());
		    Point r1 = new Point(sc.nextInt(), sc.nextInt());
		    Point l2 = new Point(sc.nextInt(), sc.nextInt());
		    Point r2 = new Point(sc.nextInt(), sc.nextInt());
		    System.out.println(findOverlap(l1, r1, l2, r2) ? 1 : 0);
		}
	}
	
	static boolean findOverlap(Point l1, Point r1, Point l2, Point r2){
	    if(l1.x > r2.x || r1.x < l2.x)
	        return false;
	    if(l1.y < r2.y || r1.y > l2.y)
	        return false;
	    return true;     
	}
}